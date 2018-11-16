package typings
package fpDashTsLib.libOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Option", "None")
@js.native
class None[A] protected () extends js.Object {
  val _A: A = js.native
  val _URI: URI = js.native
  val _tag: fpDashTsLib.fpDashTsLibStrings.None = js.native
  /**
       * `alt` short for alternative, takes another `Option`. If this `Option` is a `Some` type then it will be returned, if
       * it is a `None` then it will return the next `Some` if it exist. If both are `None` then it will return `none`.
       *
       * @example
       * import { Option, some, none } from 'fp-ts/lib/Option'
       *
       * assert.deepEqual(some(2).alt(some(4)), some(2))
       * const fa: Option<number> = none
       * assert.deepEqual(fa.alt(some(4)), some(4))
       */
  def alt(fa: Option[A]): Option[A] = js.native
  /**
       * `ap`, some may also call it "apply". Takes a function `fab` that is in the context of `Option`, and applies that
       * function to this `Option`'s value. If the `Option` calling `ap` is `none` it will return `none`.
       *
       * @example
       * import { some, none } from 'fp-ts/lib/Option'
       *
       * assert.deepEqual(some(2).ap(some((x: number) => x + 1)), some(3))
       * assert.deepEqual(none.ap(some((x: number) => x + 1)), none)
       */
  def ap[B](fab: Option[js.Function1[/* a */ A, B]]): Option[B] = js.native
  /**
       * Flipped version of {@link ap}
       *
       * @example
       * import { some, none } from 'fp-ts/lib/Option'
       *
       * assert.deepEqual(some((x: number) => x + 1).ap_(some(2)), some(3))
       * assert.deepEqual(none.ap_(some(2)), none)
       */
  def `ap_`[B, C](`this`: Option[js.Function1[/* b */ B, C]], fb: Option[B]): Option[C] = js.native
  /**
       * Returns the result of applying f to this `Option`'s value if this `Option` is nonempty. Returns `None` if this
       * `Option` is empty. Slightly different from `map` in that `f` is expected to return an `Option` (which could be
       * `None`)
       */
  def chain[B](f: js.Function1[/* a */ A, Option[B]]): Option[B] = js.native
  /** Returns `true` if the option has an element that is equal (as determined by `S`) to `a`, `false` otherwise */
  def contains(S: fpDashTsLib.libSetoidMod.Setoid[A], a: A): scala.Boolean = js.native
  /**
       * Returns `true` if this option is non empty and the predicate `p` returns `true` when applied to this Option's value
       */
  def exists(p: js.Function1[/* a */ A, scala.Boolean]): scala.Boolean = js.native
  def extend[B](f: js.Function1[/* ea */ Option[A], B]): Option[B] = js.native
  /**
       * Returns this option if it is non empty and the predicate `p` return `true` when applied to this Option's value.
       * Otherwise returns `None`
       */
  def filter(p: fpDashTsLib.libFunctionMod.Predicate[A]): Option[A] = js.native
  /**
       * Applies a function to each case in the data structure
       *
       * @example
       * import { none, some } from 'fp-ts/lib/Option'
       *
       * assert.strictEqual(some(1).fold('none', a => `some: ${a}`), 'some: 1')
       * assert.strictEqual(none.fold('none', a => `some: ${a}`), 'none')
       */
  def fold[B](b: B, whenSome: js.Function1[/* a */ A, B]): B = js.native
  /** Lazy version of {@link fold} */
  def foldL[B](whenNone: js.Function0[B], whenSome: js.Function1[/* a */ A, B]): B = js.native
  /**
       * Returns the value from this `Some` or the given argument if this is a `None`
       *
       * @example
       * import { Option, none, some } from 'fp-ts/lib/Option'
       *
       * assert.strictEqual(some(1).getOrElse(0), 1)
       * const fa: Option<number> = none
       * assert.strictEqual(fa.getOrElse(0), 0)
       */
  def getOrElse(a: A): A = js.native
  /** Lazy version of {@link getOrElse} */
  def getOrElseL(f: js.Function0[A]): A = js.native
  def inspect(): java.lang.String = js.native
  /** Returns `true` if the option is `None`, `false` otherwise */
  def isNone(): /* is None */scala.Boolean = js.native
  /** Returns `true` if the option is an instance of `Some`, `false` otherwise */
  def isSome(): /* is Some */scala.Boolean = js.native
  /**
       * Takes a function `f` and an `Option` of `A`. Maps `f` either on `None` or `Some`, Option's data constructors. If it
       * maps on `Some` then it will apply the `f` on `Some`'s value, if it maps on `None` it will return `None`.
       *
       * @example
       * import { some } from 'fp-ts/lib/Option'
       *
       * assert.deepEqual(some(1).map(n => n * 2), some(2))
       */
  def map[B](f: js.Function1[/* a */ A, B]): Option[B] = js.native
  /**
       * Maps `f` over this `Option`'s value. If the value returned from `f` is null or undefined, returns `None`
       *
       * @example
       * import { none, some } from 'fp-ts/lib/Option'
       *
       * interface Foo {
       *   bar?: {
       *     baz?: string
       *   }
       * }
       *
       * assert.deepEqual(
       *   some<Foo>({ bar: { baz: 'quux' } })
       *     .mapNullable(foo => foo.bar)
       *     .mapNullable(bar => bar.baz),
       *   some('quux')
       * )
       * assert.deepEqual(
       *   some<Foo>({ bar: {} })
       *     .mapNullable(foo => foo.bar)
       *     .mapNullable(bar => bar.baz),
       *   none
       * )
       * assert.deepEqual(
       *   some<Foo>({})
       *     .mapNullable(foo => foo.bar)
       *     .mapNullable(bar => bar.baz),
       *   none
       * )
       */
  def mapNullable[B](f: js.Function1[/* a */ A, js.UndefOr[B | scala.Null]]): Option[B] = js.native
  /**
       * Lazy version of {@link alt}
       *
       * @example
       * import { some } from 'fp-ts/lib/Option'
       *
       * assert.deepEqual(some(1).orElse(() => some(2)), some(1))
       *
       * @since 1.6.0
       */
  def orElse(fa: fpDashTsLib.libFunctionMod.Lazy[Option[A]]): Option[A] = js.native
  def reduce[B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
  /**
       * Returns this option refined as `Option<B>` if it is non empty and the `refinement` returns `true` when applied to
       * this Option's value. Otherwise returns `None`
       * @since 1.3.0
       */
  def refine[B /* <: A */](refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): Option[B] = js.native
  /** Returns the value from this `Some` or `null` if this is a `None` */
  def toNullable(): A | scala.Null = js.native
  /** Returns the value from this `Some` or `undefined` if this is a `None` */
  def toUndefined(): js.UndefOr[A] = js.native
}

@JSImport("fp-ts/lib/Option", "None")
@js.native
object None extends js.Object {
  var value: fpDashTsLib.libOptionMod.Option[scala.Nothing] = js.native
}

