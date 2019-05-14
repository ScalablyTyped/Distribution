
# Scala.js typings for fp-ts

Typings are for version 1.18.0

## Library description:
Functional programming in TypeScript

|                    |                 |
| ------------------ | :-------------: |
| Full name          | fp-ts |
| Keywords           | typescript, algebraic-data-types, functional-programming |
| # releases         | 78 |
| # dependents       | 106 |
| # downloads        | 1759437 |
| # stars            | 0 |

## Links
- [Homepage](https://github.com/gcanti/fp-ts)
- [Bugs](https://github.com/gcanti/fp-ts/issues)
- [Repository](https://github.com/gcanti/fp-ts)
- [Npm](https://www.npmjs.com/package/fp-ts)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
 * @file The `Alt` type class identifies an associative operation on a type constructor.  It is similar to `Semigroup`, except
 * that it applies to types of kind `* -> *`, like `Array` or `Option`, rather than concrete types like `string` or
 * `number`.
 *
 * `Alt` instances are required to satisfy the following laws:
 *
 * 1. Associativity: `A.alt(A.alt(fa, ga), ha) = A.alt(fa, A.alt(ga, ha))`
 * 2. Distributivity: `A.map(A.alt(fa, ga), ab) = A.alt(A.map(fa, ab), A.map(ga, ab))`
 */
/**
 * @file The `Alternative` type class has no members of its own; it just specifies that the type constructor has both
 * `Applicative` and `Plus` instances.
 *
 * Types which have `Alternative` instances should also satisfy the following laws:
 *
 * 1. Distributivity: `A.ap(A.alt(fab, gab), fa) = A.alt(A.ap(fab, fa), A.ap(gab, fa))`
 * 2. Annihilation: `A.ap(zero, fa) = zero`
 */
/**
 * @file The `Applicative` type class extends the `Apply` type class with a `of` function, which can be used to create values
 * of type `f a` from values of type `a`.
 *
 * Where `Apply` provides the ability to lift functions of two or more arguments to functions whose arguments are
 * wrapped using `f`, and `Functor` provides the ability to lift functions of one argument, `pure` can be seen as the
 * function which lifts functions of _zero_ arguments. That is, `Applicative` functors support a lifting operation for
 * any number of function arguments.
 *
 * Instances must satisfy the following laws in addition to the `Apply` laws:
 *
 * 1. Identity: `A.ap(A.of(a => a), fa) = fa`
 * 2. Homomorphism: `A.ap(A.of(ab), A.of(a)) = A.of(ab(a))`
 * 3. Interchange: `A.ap(fab, A.of(a)) = A.ap(A.of(ab => ab(a)), fab)`
 *
 * Note. `Functor`'s `map` can be derived: `A.map(x, f) = A.ap(A.of(f), x)`
 */
/**
 * @file The `Apply` class provides the `ap` which is used to apply a function to an argument under a type constructor.
 *
 * `Apply` can be used to lift functions of two or more arguments to work on values wrapped with the type constructor
 * `f`.
 *
 * Instances must satisfy the following law in addition to the `Functor` laws:
 *
 * 1. Associative composition: `F.ap(F.ap(F.map(fbc, bc => ab => a => bc(ab(a))), fab), fa) = F.ap(fbc, F.ap(fab, fa))`
 *
 * Formally, `Apply` represents a strong lax semi-monoidal endofunctor.
 */
/**
 * @file Adapted from https://github.com/purescript/purescript-arrays
 */
/**
 * @file Boolean algebras are Heyting algebras with the additional constraint that the law of the excluded middle is true
 * (equivalently, double-negation is true).
 *
 * Instances should satisfy the following laws in addition to the `HeytingAlgebra` laws:
 *
 * - Excluded middle: `a ∨ ¬a = 1`
 *
 * Boolean algebras generalize classical logic: one is equivalent to "true" and zero is equivalent to "false".
 */
/**
 * @file The `Bounded` type class represents totally ordered types that have an upper and lower boundary.
 *
 * Instances should satisfy the following law in addition to the `Ord` laws:
 *
 * - Bounded: `bottom <= a <= top`
 */
/**
 * @file A `BoundedDistributiveLattice` is a lattice that is both bounded and distributive
 */
/**
 * @file A `BoundedJoinSemilattice` must satisfy the following laws in addition to `JoinSemilattice` laws:
 *
 * - `a ∨ 0 == a`
 */
/**
 * @file A `BoundedLattice` must satisfy the following in addition to `BoundedMeetSemilattice` and `BoundedJoinSemilattice` laws:
 *
 * - Absorbtion law for meet: `a ∧ (a ∨ b) == a`
 * - Absorbtion law for join: `a ∨ (a ∧ b) == a`
 */
/**
 * @file A `BoundedMeetSemilattice` must satisfy the following laws in addition to `MeetSemilattice` laws:
 *
 * - `a ∧ 1 = a`
 */
/**
 * @file The `Chain` type class extends the `Apply` type class with a `chain` operation which composes computations in
 * sequence, using the return value of one computation to determine the next computation.
 *
 * Instances must satisfy the following law in addition to the `Apply` laws:
 *
 * 1. Associativity: `F.chain(F.chain(fa, afb), bfc) <-> F.chain(fa, a => F.chain(afb(a), bfc))`
 *
 * Note. `Apply`'s `ap` can be derived: `(fab, fa) => F.chain(fab, f => F.map(f, fa))`
 */
/**
 * @file The `Choice` class extends `Profunctor` with combinators for working with
 * sum types.
 *
 * `left` and `right` lift values in a `Profunctor` to act on the `Left` and
 * `Right` components of a sum, respectively.
 *
 * Looking at `Choice` through the intuition of inputs and outputs
 * yields the following type signature:
 *
 * ```purescript
 * left ::  forall input output a. p input output -> p (Either input a) (Either output a)
 * right :: forall input output a. p input output -> p (Either a input) (Either a output)
 * ```
 *
 * If we specialize the profunctor `p` to the `function` arrow, we get the following type
 * signatures:
 *
 * ```purescript
 * left ::  forall input output a. (input -> output) -> (Either input a) -> (Either output a)
 * right :: forall input output a. (input -> output) -> (Either a input) -> (Either a output)
 * ```
 *
 * When the `profunctor` is `Function` application, `left` allows you to map a function over the
 * left side of an `Either`, and `right` maps it over the right side (same as `map` would do).
 *
 * Adapted from https://github.com/purescript/purescript-profunctor/blob/master/src/Data/Profunctor/Choice.purs
 */
/**
 * @file `Compactable` represents data structures which can be _compacted_/_filtered_. This is a generalization of
 * `catOptions` as a new function `compact`. `compact` has relations with `Functor`, `Applicative`,
 * `Monad`, `Plus`, and `Traversable` in that we can use these classes to provide the ability to
 * operate on a data type by eliminating intermediate `None`s. This is useful for representing the filtering out of
 * values, or failure.
 *
 * Adapted from https://github.com/LiamGoodacre/purescript-filterable/blob/master/src/Data/Compactable.purs
 */
/**
 * @file Adapted from https://github.com/purescript/purescript-console
 */
/**
 * @file A `DistributiveLattice` must satisfy the following laws in addition to `Lattice` laws:
 *
 * - Distributivity for meet: `a ∨ (b ∧ c) = (a ∨ b) ∧ (a ∨ c)`
 * - Distributivity for join: `a ∧ (b ∨ c) = (a ∧ b) ∨ (a ∧ c)`
 */
/**
 * @file Represents a value of one of two possible types (a disjoint union).
 *
 * An instance of `Either` is either an instance of `Left` or `Right`.
 *
 * A common use of `Either` is as an alternative to `Option` for dealing with possible missing values. In this usage,
 * `None` is replaced with a `Left` which can contain useful information. `Right` takes the place of `Some`. Convention
 * dictates that `Left` is used for failure and `Right` is used for success.
 *
 * For example, you could use `Either<string, number>` to detect whether a received input is a `string` or a `number`.
 *
 * ```ts
 * const parse = (errorMessage: string) => (input: string): Either<string, number> => {
 *   const n = parseInt(input, 10)
 *   return isNaN(n) ? left(errorMessage) : right(n)
 * }
 * ```
 *
 * `Either` is right-biased, which means that `Right` is assumed to be the default case to operate on. If it is `Left`,
 * operations like `map`, `chain`, ... return the `Left` value unchanged:
 *
 * ```ts
 * right(12).map(double) // right(24)
 * left(23).map(double)  // left(23)
 * ```
 */
/**
 * @file Adapted from https://github.com/purescript/purescript-exceptions
 */
/**
 * @file Adapted from https://github.com/purescript/purescript-prelude/blob/master/src/Data/Field.purs
 */
/**
 * @file `Filterable` represents data structures which can be _partitioned_/_filtered_.
 *
 * Adapted from https://github.com/LiamGoodacre/purescript-filterable/blob/master/src/Data/Filterable.purs
 */
/**
 * @file A `Foldable` with an additional index.
 * A `FoldableWithIndex` instance must be compatible with its `Foldable` instance
 *
 * ```ts
 * reduce(fa, b, f) = reduceWithIndex(fa, b, (_, b, a) => f(b, a))
 * foldMap(M)(fa, f) = foldMapWithIndex(M)(fa, (_, a) => f(a))
 * foldr(fa, b, f) = foldrWithIndex(fa, b, (_, a, b) => f(a, b))
 * ```
 */
/**
 * @file Adapted from http://okmij.org/ftp/Computation/free-monad.html and https://github.com/purescript/purescript-free
 */
/**
 * @file A `FunctorWithIndex` is a type constructor which supports a mapping operation `mapWithIndex`.
 *
 * `mapWithIndex` can be used to turn functions `i -> a -> b` into functions `f a -> f b` whose argument and return types use the type
 * constructor `f` to represent some computational context.
 *
 * Instances must satisfy the following laws:
 *
 * 1. Identity: `F.mapWithIndex(fa, (_i, a) => a) = fa`
 * 2. Composition: `F.mapWithIndex(fa, (_i, a) => bc(ab(a))) = F.mapWithIndex(F.mapWithIndex(fa, ab), bc)`
 */
/**
 * @file A `Group` is a `Monoid` with inverses. Instances must satisfy the following law in addition to the monoid laws:
 *
 * - Inverse: `concat(inverse(a), a) = empty = concat(a, inverse(a))`
 */
/**
 * @file Type defunctionalization (as describe in [Lightweight higher-kinded polymorphism](https://www.cl.cam.ac.uk/~jdy22/papers/lightweight-higher-kinded-polymorphism.pdf))
 */
/**
 * `* -> *` constructors
 */
/**
 * @file Heyting algebras are bounded (distributive) lattices that are also equipped with an additional binary operation
 * `implies` (also written as `→`). Heyting algebras also define a complement operation `not` (sometimes written as
 * `¬a`)
 *
 * However, in Heyting algebras this operation is only a pseudo-complement, since Heyting algebras do not necessarily
 * provide the law of the excluded middle. This means that there is no guarantee that `a ∨ ¬a = 1`.
 *
 * Heyting algebras model intuitionistic logic. For a model of classical logic, see the boolean algebra type class
 * implemented as `BooleanAlgebra`.
 *
 * A `HeytingAlgebra` must satisfy the following laws in addition to `BoundedDistributiveLattice` laws:
 *
 * - Implication:
 *   - `a → a = 1`
 *   - `a ∧ (a → b) = a ∧ b`
 *   - `b ∧ (a → b) = b`
 *   - `a → (b ∧ c) = (a → b) ∧ (a → c)`
 * - Complemented
 *   - `¬a = a → 0`
 */
/**
 * @file `IO<A>` represents a non-deterministic synchronous computation that can cause side effects, yields a value of
 * type `A` and **never fails**. If you want to represent a synchronous computation that may fail, please see
 * `IOEither`.
 *
 * IO actions are terminated by calling their `run()` method that executes the computation and returns the result.
 * Ideally each application should call `run()` only once for a root value of type `Task` or `IO` that represents the entire
 * application. However, this might vary a bit depending on how you construct your application.  An application
 * framework with fp-ts types might take care of calling `run()` for you, while another application framework without
 * fp-ts typing might force you to call `run()` at multiple locations whenever the framework demands less strictly typed
 * values as inputs for its method calls.
 *
 * Below are some basic examples of how you can wrap values and function calls with `IO`.
 *
 * ```ts
 * import { IO, io } from 'fp-ts/lib/IO'
 *
 * const constant: IO<number> = io.of(123);
 * constant.run()  // returns 123
 *
 * const random: IO<number> = new IO(() => Math.random())
 * random.run()  // returns a random number
 * random.run()  // returns another random number
 *
 * const log = (...args): IO<void> => new IO(() => console.log(...args));
 * log('hello world').run()  // returns undefined and outputs "hello world" to console
 * ```
 *
 * In the example above we implemented type safe alternatives for `Math.random()` and `console.log()`. The main
 * motivation was to explain how you can wrap values. However, fp-ts provides type safe alternatives for such basic
 * tools through `Console` and `Random` modules. So you don't need to constantly redefine them.
 *
 * The next code snippet below is an example of a case where type safety affects the end result. Using `console.log()`
 * directly would break the code, resulting in both logging actions being executed when the value is not `null`.  You
 * can confirm this by removing `.run()` from the end of the example code and replacing calls to `log()` with
 * standard`console.log()`.
 *
 * ```ts
 * import { IO } from 'fp-ts/lib/IO'
 * import { fromNullable } from 'fp-ts/lib/Option'
 * import { log } from 'fp-ts/lib/Console'
 *
 * const logger = (input: number|null) => fromNullable(input).fold(
 *   log('Received null'),
 *   (value) => log(`Received ${value}`),
 * );
 *
 * logger(123).run();  // returns undefined and outputs "Received 123" to console
 * ```
 *
 * In addition to creating IO actions we need a way to combine them to build the application.  For example we might have
 * several `IO<void>` actions that only cause side effects without returning a result.  We  can combine several `IO<void>`
 * actions into one for sequential execution with `sequence_(io, array)` as follows. This is useful when you care about
 * the execution order but do not care about the results.
 *
 * ```ts
 * import { IO, io } from 'fp-ts/lib/IO'
 * import { array } from 'fp-ts/lib/Array'
 * import { sequence_ } from 'fp-ts/lib/Foldable2v'
 * import { log } from 'fp-ts/lib/Console'
 *
 * const logGiraffe: IO<void> = log('giraffe');
 * const logZebra: IO<void> = log('zebra');
 *
 * const logGiraffeThenZebra: IO<void> = sequence_(io, array)([ logGiraffe, logZebra ])
 *
 * logGiraffeThenZebra.run();  // returns undefined and outputs words "giraffe" and "zebra" to console
 * ```
 *
 * We might also have several IO actions that yield some values that we want to capture. We can combine them by
 * using `sequenceS(io)` over an object matching the structure of the expected result. This is useful when you care
 * about the results but do not care about the execution order.
 *
 * ```ts
 * import { IO, io } from 'fp-ts/lib/IO'
 * import { sequenceS } from 'fp-ts/lib/Apply'
 *
 * interface Result {
 *   name: string,
 *   age: number,
 * }
 *
 * const computations: { [K in keyof Result]: IO<Result[K]> } = {
 *   name: io.of('Aristotle'),
 *   age: io.of(60),
 * }
 *
 * const computation: IO<Result> = sequenceS(io)(computations)
 *
 * computation.run()  // returns { name: 'Aristotle', age: 60 }
 * ```
 */
/**
 * @file `IOEither<L, A>` represents a synchronous computation that either yields a value of type `A` or fails yielding an
 * error of type `L`. If you want to represent a synchronous computation that never fails, please see `IO`.
 */
/**
 * @file Mutable references in the `IO` monad
 */
/**
 * @file A join-semilattice (or upper semilattice) is a semilattice whose operation is called `join`, and which can be thought
 * of as a least upper bound.
 *
 * A `JoinSemilattice` must satisfy the following laws:
 *
 * - Associativity: `a ∨ (b ∨ c) = (a ∨ b) ∨ c`
 * - Commutativity: `a ∨ b = b ∨ a`
 * - Idempotency:   `a ∨ a = a`
 *
 */
/**
 * @since 1.4.0
 */
/**
 * @file A `Lattice` must satisfy the following in addition to `JoinSemilattice` and `MeetSemilattice` laws:
 *
 * - Absorbtion law for meet: `a ∧ (a ∨ b) == a`
 * - Absorbtion law for join: `a ∨ (a ∧ b) == a`
 */
/**
 * A `Magma` is a pair `(A, concat)` in which `A` is a non-empty set and `concat` is a binary operation on `A`
 * @since 1.16.0
 */
/**
 * @file A meet-semilattice (or lower semilattice) is a semilattice whose operation is called `meet`, and which can be thought
 * of as a greatest lower bound.
 *
 * A `MeetSemilattice` must satisfy the following laws:
 *
 * - Associativity: `a ∧ (b ∧ c) = (a ∧ b) ∧ c`
 * - Commutativity: `a ∧ b = b ∧ a`
 * - Idempotency:   `a ∧ a = a`
 */
/**
 * @file The `Monad` type class combines the operations of the `Chain` and
 * `Applicative` type classes. Therefore, `Monad` instances represent type
 * constructors which support sequential composition, and also lifting of
 * functions of arbitrary arity.
 *
 * Instances must satisfy the following laws in addition to the `Applicative` and `Chain` laws:
 *
 * 1. Left identity: `M.chain(M.of(a), f) = f(a)`
 * 2. Right identity: `M.chain(fa, M.of) = fa`
 *
 * Note. `Functor`'s `map` can be derived: `A.map = (fa, f) => A.chain(fa, a => A.of(f(a)))`
 */
/**
 * @file Lift a computation from the `IO` monad
 */
/**
 * @file Lift a computation from the `Task` monad
 */
/**
 * @file `Applicative` functors are equivalent to strong lax monoidal functors
 *
 * - https://wiki.haskell.org/Typeclassopedia#Alternative_formulation
 * - https://bartoszmilewski.com/2017/02/06/applicative-functors/
 */
/**
 * @file Data structure which represents non-empty arrays
 */
/**
 * @file If you have worked with JavaScript at all in the past, it is very likely that you have come across a `TypeError` at
 * some time (other languages will throw similarly named errors in such a case). Usually this happens because some
 * method returns `null` or `undefined` when you were not expecting it and thus not dealing with that possibility in
 * your client code.
 *
 * ```ts
 * const as: Array<string> = []
 * as[0].trim() // throws TypeError: Cannot read property 'trim' of undefined
 * ```
 *
 * fp-ts models the absence of values through the `Option` datatype similar to how Scala, Haskell and other FP languages
 * handle optional values. A value of `null` or `undefined` is often abused to represent an absent optional value.
 *
 * `Option<A>` is a container for an optional value of type `A`. If the value of type `A` is present, the `Option<A>` is
 * an instance of `Some<A>`, containing the present value of type `A`. If the value is absent, the `Option<A>` is an
 * instance of `None<A>`.
 *
 * An option could be looked at as a collection or foldable structure with either one or zero elements.
 * Another way to look at option is: it represents the effect of a possibly failing computation.
 *
 * ```ts
 * import { Option, some, none } from 'fp-ts/lib/Option'
 *
 * const someValue: Option<string> = some('foo')
 * const emptyValue: Option<string> = none
 * ```
 *
 * Let's write a function that may or not give us a string, thus returning `Option<string>`
 *
 *
 * ```ts
 * const head = (as: Array<string>): Option<string> => {
 *   return as.length > 0 ? some(as[0]) : none
 * }
 * ```
 *
 * Using `getOrElse` we can provide a default value `"No value"` when the optional argument `None` does not exist:
 *
 * ```ts
 * const value1 = head(['foo', 'bar']) // some('foo)
 * const value2 = head([]) // none
 * value1.getOrElse('No value') // 'foo'
 * value2.getOrElse('No value') // 'No value'
 * ```
 *
 * Checking whether option has value:
 *
 * ```ts
 * value1.isNone() // false
 * value2.isNone() // true
 * ```
 *
 * We can pattern match using the `fold` method
 *
 * ```ts
 * const number: Option<number> = some(3)
 * const noNumber: Option<number> = none
 * number.fold(1, n => n * 3) // 9
 * noNumber.fold(1, n => n * 3) // 1
 * ```
 *
 * You can chain several possibly failing computations using the `chain` method
 *
 * ```ts
 * const inverse = (n: number): Option<number> => {
 *   return n === 0 ? none : some(1 / n)
 * }
 *
 * number.chain(inverse) // 1/3
 * noNumber.chain(inverse) // none
 * some(0).chain(inverse) // none
 * ```
 *
 * Computing over independent values
 *
 * ```ts
 * const sum = (a: number) => (b: number): number => a + b
 * const sumLifted = (oa: Option<number>, ob: Option<number>): Option<number> => ob.ap(oa.map(sum))
 * sumLifted(some(1), some(2)) // some(3)
 * sumLifted(some(1), none) // none
 * ```
 */
/**
 * @file The `Ord` type class represents types which support comparisons with a _total order_.
 *
 * Instances should satisfy the laws of total orderings:
 *
 * 1. Reflexivity: `S.compare(a, a) <= 0`
 * 2. Antisymmetry: if `S.compare(a, b) <= 0` and `S.compare(b, a) <= 0` then `a <-> b`
 * 3. Transitivity: if `S.compare(a, b) <= 0` and `S.compare(b, c) <= 0` then `S.compare(a, c) <= 0`
 *
 * See [Getting started with fp-ts: Ord](https://dev.to/gcanti/getting-started-with-fp-ts-ord-5f1e)
 */
/**
 * @file Adapted from https://github.com/parsonsmatt/purescript-pair
 */
/**
 * @file The `Plus` type class extends the `alt` type class with a value that should be the left and right identity for `alt`.
 *
 * It is similar to `Monoid`, except that it applies to types of kind `* -> *`, like `Array` or `Option`, rather than
 * concrete types like `string` or `number`.
 *
 * `Plus` instances should satisfy the following laws:
 *
 * 1. Left identity: `A.alt(zero, fa) == fa`
 * 2. Right identity: `A.alt(fa, zero) == fa`
 * 3. Annihilation: `A.map(zero, fa) == zero`
 */
/**
 * @file Adapted from https://github.com/purescript/purescript-random
 */
/**
 * @file The `Ring` class is for types that support addition, multiplication, and subtraction operations.
 *
 * Instances must satisfy the following law in addition to the `Semiring` laws:
 *
 * - Additive inverse: `a - a = (zero - a) + a = zero`
 *
 * Adapted from https://github.com/purescript/purescript-prelude/blob/master/src/Data/Ring.purs
 */
/**
 * @file See [Getting started with fp-ts: Semigroup](https://dev.to/gcanti/getting-started-with-fp-ts-semigroup-2mf7)
 */
/**
 * @file The `Semiring` class is for types that support an addition and multiplication operation.
 *
 * Instances must satisfy the following laws:
 *
 * - Commutative monoid under addition:
 *   - Associativity: `(a + b) + c = a + (b + c)`
 *   - Identity: `zero + a = a + zero = a`
 *   - Commutative: `a + b = b + a`
 * - Monoid under multiplication:
 *   - Associativity: `(a * b) * c = a * (b * c)`
 *   - Identity: `one * a = a * one = a`
 * - Multiplication distributes over addition:
 *   - Left distributivity: `a * (b + c) = (a * b) + (a * c)`
 *   - Right distributivity: `(a + b) * c = (a * c) + (b * c)`
 * - Annihilation: `zero * a = a * zero = zero`
 *
 * **Note:** The `number` type is not fully law abiding members of this class hierarchy due to the potential
 * for arithmetic overflows, and the presence of `NaN` and `Infinity` values. The behaviour is
 * unspecified in these cases.
 */
/**
 * @since 1.0.0
 */
/**
 * @file The `Setoid` type class represents types which support decidable equality.
 *
 * Instances must satisfy the following laws:
 *
 * 1. Reflexivity: `S.equals(a, a) === true`
 * 2. Symmetry: `S.equals(a, b) === S.equals(b, a)`
 * 3. Transitivity: if `S.equals(a, b) === true` and `S.equals(b, c) === true`, then `S.equals(a, c) === true`
 *
 * See [Getting started with fp-ts: Setoid](https://dev.to/gcanti/getting-started-with-fp-ts-setoid-39f3)
 */
/**
 * The `Show` type class represents those types which can be converted into
 * a human-readable `string` representation.
 *
 * While not required, it is recommended that for any expression `x`, the
 * string `show x` be executable TypeScript code which evaluates to the same
 * value as the expression `x`.
 */
/**
 * @file Adapted from https://github.com/purescript/purescript-maps
 */
/**
 * @file The `Strong` class extends `Profunctor` with combinators for working with product types.
 *
 * `first` and `second` lift values in a `Profunctor` to act on the first and second components of a tuple,
 * respectively.
 *
 * Another way to think about Strong is to piggyback on the intuition of
 * inputs and outputs.  Rewriting the type signature in this light then yields:
 *
 * ```purescript
 * first ::  forall input output a. p input output -> p (Tuple input a) (Tuple output a)
 * second :: forall input output a. p input output -> p (Tuple a input) (Tuple a output)
 * ```
 *
 * If we specialize the profunctor p to the function arrow, we get the following type
 * signatures, which may look a bit more familiar:
 *
 * ```purescript
 * first ::  forall input output a. (input -> output) -> (Tuple input a) -> (Tuple output a)
 * second :: forall input output a. (input -> output) -> (Tuple a input) -> (Tuple a output)
 * ```
 *
 * So, when the `profunctor` is `Function` application, `first` essentially applies your function
 * to the first element of a tuple, and `second` applies it to the second element (same as `map` would do).
 *
 * Adapted from https://github.com/purescript/purescript-profunctor/blob/master/src/Data/Profunctor/Strong.purs
 */
/**
 * @file `Task<A>` represents an asynchronous computation that yields a value of type `A` and **never fails**.
 * If you want to represent an asynchronous computation that may fail, please see `TaskEither`.
 */
/**
 * @file `TaskEither<L, A>` represents an asynchronous computation that either yields a value of type `A` or fails yielding an
 * error of type `L`. If you want to represent an asynchronous computation that never fails, please see `Task`.
 */
/**
 * @file Adapted from https://github.com/garyb/purescript-debug
 */
/**
 * @file `Traversable` represents data structures which can be _traversed_ accumulating results and effects in some
 * `Applicative` functor.
 *
 * `traverse` signature:
 *
 * ```ts
 * <F>(F: Applicative<F>) => <A, B>(ta: HKT<T, A>, f: (a: A) => HKT<F, B>) => HKT<F, HKT<T, B>>
 * ```
 *
 * `sequence` signature:
 *
 * ```ts
 * <F>(F: Applicative<F>) => <A>(ta: HKT<T, HKT<F, A>>) => HKT<F, HKT<T, A>>
 * ```
 */
/**
 * @file A `Traversable` with an additional index.
 * A `TraversableWithIndex` instance must be compatible with its `Traversable` instance
 *
 * ```ts
 * traverse(F)(ta, f) = traverseWithIndex(F)(ta, (_, a) => f(a))
 * ```
 *
 * with its `FoldableWithIndex` instance
 *
 * ```ts
 * foldMapWithIndex(M)(ta, f) = traverseWithIndex(getApplicative(M))(ta, (i, a) => new Const(f(i, a))).value
 * ```
 *
 * and with its `FunctorWithIndex` instance
 *
 * ```purescript
 * mapWithIndex(ta, f) = traverseWithIndex(identity)(ta, (i, a) => new Identity(f(i, a))).value
 * ```
 */
/**
 * @file Adapted from https://github.com/purescript/purescript-tuples
 */
/**
 * @file This class identifies data structures which can be _unfolded_, generalizing `unfoldr` on arrays.
 */
/**
 * @file The `Validation` functor, used for applicative validation
 *
 * The `Applicative` instance collects multiple failures in an arbitrary `Semigroup`.
 *
 * Adapted from https://github.com/purescript/purescript-validation
 */
/**
 * `Witherable` represents data structures which can be _partitioned_ with effects in some `Applicative` functor.
 *
 * `wilt` signature (see `Compactable` `Separated`):
 *
 * ```ts
 * <F>(F: Applicative<F>) => <RL, RR, A>(wa: HKT<W, A>, f: (a: A) => HKT<F, Either<RL, RR>>) => HKT<F, Separated<HKT<W, RL>, HKT<W, RR>>>
 * ```
 *
 * `wither` signature:
 *
 * ```ts
 * <F>(F: Applicative<F>) => <A, B>(ta: HKT<W, A>, f: (a: A) => HKT<F, Option<B>>) => HKT<F, HKT<W, B>>
 * ```
 *
 * Adapted from https://github.com/LiamGoodacre/purescript-filterable/blob/master/src/Data/Witherable.purs
 */
/**
 * @file Provides a pointed array, which is a non-empty zipper-like array structure that tracks an index (focus)
 * position in an array. Focus can be moved forward and backwards through the array.
 *
 * The array `[1, 2, 3, 4]` with focus on `3` is represented by `new Zipper([1, 2], 3, [4])`
 *
 * Adapted from
 *
 * - https://github.com/DavidHarrison/purescript-list-zipper
 * - https://github.com/thunklife/purescript-zipper
 * - https://github.com/scalaz/scalaz/blob/series/7.3.x/core/src/main/scala/scalaz/Zipper.scala
 */

```

