package typings.esfxEquatable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/equatable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Comparable extends StObject
  object Comparable {
    
    @JSImport("@esfx/equatable", "Comparable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A well-known symbol used to define a relational comparison method on a value.
      */
    @JSImport("@esfx/equatable", "Comparable.compareTo")
    @js.native
    val compareTo: js.Symbol = js.native
    
    /**
      * Determines whether a value is Comparable.
      * @param value The value to test.
      * @returns `true` if the value is a Comparable; otherwise, `false`.
      */
    inline def hasInstance(value: Any): /* is @esfx/equatable.@esfx/equatable.Comparable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/equatable.@esfx/equatable.Comparable */ Boolean]
    
    @JSImport("@esfx/equatable", "Comparable.name")
    @js.native
    val name: /* "Comparable" */ String = js.native
  }
  
  trait Comparer[T] extends StObject {
    
    /**
      * Compares two values, returning a value indicating one of the following conditions:
      * - A negative value indicates `x` is lesser than `y`.
      * - A positive value indicates `x` is greater than `y`.
      * - A zero value indicates `x` and `y` are equivalent.
      * @param x The first value to compare.
      * @param y The second value to compare.
      * @returns A number indicating the relational comparison result.
      */
    def compare(x: T, y: T): Double
  }
  object Comparer {
    
    inline def apply[T](compare: (T, T) => Double): Comparer[T] = {
      val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare))
      __obj.asInstanceOf[Comparer[T]]
    }
    
    @JSImport("@esfx/equatable", "Comparer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a `Comparer` from a comparison function.
      * @typeParam T The type of value that can be compared.
      * @param comparison A Comparison function used to create a Comparer.
      * @returns The Comparer for the provided comparison function.
      */
    inline def create[T](comparison: Comparison[T]): Comparer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(comparison.asInstanceOf[js.Any]).asInstanceOf[Comparer[T]]
    
    /**
      * The default `Comparer`.
      */
    @JSImport("@esfx/equatable", "Comparer.defaultComparer")
    @js.native
    val defaultComparer: Comparer[Any] = js.native
    
    inline def hasInstance(value: Any): /* is @esfx/equatable.@esfx/equatable.Comparer<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/equatable.@esfx/equatable.Comparer<unknown> */ Boolean]
    
    /**
      * A default `Comparer` that supports `StructuralComparable` values.
      */
    @JSImport("@esfx/equatable", "Comparer.structuralComparer")
    @js.native
    val structuralComparer: Comparer[Any] = js.native
    
    /**
      * A default `Comparer` that compares array values rather than the arrays themselves.
      */
    @JSImport("@esfx/equatable", "Comparer.tupleComparer")
    @js.native
    val tupleComparer: Comparer[js.Array[Any]] = js.native
    
    /**
      * A default `Comparer` that compares array values that may be `StructuralComparable` rather than the arrays themselves.
      */
    @JSImport("@esfx/equatable", "Comparer.tupleStructuralComparer")
    @js.native
    val tupleStructuralComparer: Comparer[js.Array[Any]] = js.native
    
    extension [Self <: Comparer[?], T](x: Self & Comparer[T]) {
      
      inline def setCompare(value: (T, T) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    }
  }
  
  trait Equaler[T] extends StObject {
    
    /**
      * Tests whether two values are equal to each other.
      * @param x The first value.
      * @param y The second value.
      * @returns `true` if the values are equal; otherwise, `false`.
      */
    def equals(x: T, y: T): Boolean
    
    /**
      * Generates a hash code for a value.
      * @param x The value to hash.
      * @returns The numeric hash-code for the value.
      */
    def hash(x: T): Double
  }
  object Equaler {
    
    inline def apply[T](equals_ : (T, T) => Boolean, hash: T => Double): Equaler[T] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction1(hash))
      __obj.updateDynamic("equals")(js.Any.fromFunction2(equals_))
      __obj.asInstanceOf[Equaler[T]]
    }
    
    @JSImport("@esfx/equatable", "Equaler")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Combines two hash codes.
      * @param x The first hash code.
      * @param y The second hash code.
      * @param rotate The number of bits (between 0 and 31) to left-rotate the first hash code before XOR'ing it with the second (default 7).
      */
    inline def combineHashes(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("combineHashes")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def combineHashes(x: Double, y: Double, rotate: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("combineHashes")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], rotate.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Creates an `Equaler` from a comparison function and an optional hash generator.
      * @typeParam T The type of value that can be compared.
      * @param equalityComparison A callback used to compare the equality of two values.
      * @param hashGenerator A callback used to compute a numeric hash-code for a value.
      * @returns An Equaler for the provided callbacks.
      */
    inline def create[T](equalityComparison: EqualityComparison[T]): Equaler[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(equalityComparison.asInstanceOf[js.Any]).asInstanceOf[Equaler[T]]
    inline def create[T](equalityComparison: EqualityComparison[T], hashGenerator: HashGenerator[T]): Equaler[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(equalityComparison.asInstanceOf[js.Any], hashGenerator.asInstanceOf[js.Any])).asInstanceOf[Equaler[T]]
    
    /**
      * Gets the default `Equaler`.
      */
    @JSImport("@esfx/equatable", "Equaler.defaultEqualer")
    @js.native
    val defaultEqualer: Equaler[Any] = js.native
    
    inline def hasInstance(value: Any): /* is @esfx/equatable.@esfx/equatable.Equaler<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/equatable.@esfx/equatable.Equaler<unknown> */ Boolean]
    
    /**
      * Gets a default `Equaler` that supports `StructuralEquatable` values.
      */
    @JSImport("@esfx/equatable", "Equaler.structuralEqualer")
    @js.native
    val structuralEqualer: Equaler[Any] = js.native
    
    /**
      * An `Equaler` that compares array values rather than the arrays themselves.
      */
    @JSImport("@esfx/equatable", "Equaler.tupleEqualer")
    @js.native
    val tupleEqualer: Equaler[js.Array[Any]] = js.native
    
    /**
      * An `Equaler` that compares array values that may be `StructuralEquatable` rather than the arrays themselves.
      */
    @JSImport("@esfx/equatable", "Equaler.tupleStructuralEqualer")
    @js.native
    val tupleStructuralEqualer: Equaler[js.Array[Any]] = js.native
    
    extension [Self <: Equaler[?], T](x: Self & Equaler[T]) {
      
      inline def setEquals_(value: (T, T) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
      
      inline def setHash(value: T => Double): Self = StObject.set(x, "hash", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Equatable extends StObject
  object Equatable {
    
    @JSImport("@esfx/equatable", "Equatable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A well-known symbol used to define an equality test method on a value.
      */
    @JSImport("@esfx/equatable", "Equatable.equals")
    @js.native
    val equals_ : js.Symbol = js.native
    
    /**
      * Determines whether a value is Equatable.
      * @param value The value to test.
      * @returns `true` if the value is an Equatable; otherwise, `false`.
      */
    inline def hasInstance(value: Any): /* is @esfx/equatable.@esfx/equatable.Equatable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/equatable.@esfx/equatable.Equatable */ Boolean]
    
    /**
      * A well-known symbol used to define a hashing method on a value.
      */
    @JSImport("@esfx/equatable", "Equatable.hash")
    @js.native
    val hash: js.Symbol = js.native
    
    @JSImport("@esfx/equatable", "Equatable.name")
    @js.native
    val name: /* "Equatable" */ String = js.native
  }
  
  @js.native
  trait StructuralComparable extends StObject
  object StructuralComparable {
    
    @JSImport("@esfx/equatable", "StructuralComparable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Determines whether a value is StructuralComparable.
      * @param value The value to test.
      * @returns `true` if the value is StructuralComparable; otherwise, `false`.
      */
    inline def hasInstance(value: Any): /* is @esfx/equatable.@esfx/equatable.StructuralComparable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/equatable.@esfx/equatable.StructuralComparable */ Boolean]
    
    @JSImport("@esfx/equatable", "StructuralComparable.name")
    @js.native
    val name: /* "StructuralComparable" */ String = js.native
    
    /**
      * A well-known symbol used to define a structural comparison method on a value.
      */
    @JSImport("@esfx/equatable", "StructuralComparable.structuralCompareTo")
    @js.native
    val structuralCompareTo: js.Symbol = js.native
  }
  
  @js.native
  trait StructuralEquatable extends StObject
  object StructuralEquatable {
    
    @JSImport("@esfx/equatable", "StructuralEquatable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Determines whether a value is StructuralEquatable.
      * @param value The value to test.
      * @returns `true` if the value is StructuralEquatable; otherwise, `false`.
      */
    inline def hasInstance(value: Any): /* is @esfx/equatable.@esfx/equatable.StructuralEquatable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/equatable.@esfx/equatable.StructuralEquatable */ Boolean]
    
    @JSImport("@esfx/equatable", "StructuralEquatable.name")
    @js.native
    val name: /* "StructuralEquatable" */ String = js.native
    
    /**
      * A well-known symbol used to define a structural equality test method on a value.
      */
    @JSImport("@esfx/equatable", "StructuralEquatable.structuralEquals")
    @js.native
    val structuralEquals: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define a structural hashing method on a value.
      */
    @JSImport("@esfx/equatable", "StructuralEquatable.structuralHash")
    @js.native
    val structuralHash: js.Symbol = js.native
  }
  
  /**
    * Combines two hash codes.
    * @param x The first hash code.
    * @param y The second hash code.
    * @param rotate The number of bits (between 0 and 31) to left-rotate the first hash code before XOR'ing it with the second (default 7).
    */
  inline def combineHashes(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("combineHashes")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def combineHashes(x: Double, y: Double, rotate: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("combineHashes")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], rotate.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * The default `Comparer`.
    */
  @JSImport("@esfx/equatable", "defaultComparer")
  @js.native
  val defaultComparer: Comparer[Any] = js.native
  
  /**
    * Gets the default `Equaler`.
    */
  @JSImport("@esfx/equatable", "defaultEqualer")
  @js.native
  val defaultEqualer: Equaler[Any] = js.native
  
  inline def rawHash(value: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rawHash")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * A default `Comparer` that supports `StructuralComparable` values.
    */
  @JSImport("@esfx/equatable", "structuralComparer")
  @js.native
  val structuralComparer: Comparer[Any] = js.native
  
  /**
    * Gets a default `Equaler` that supports `StructuralEquatable` values.
    */
  @JSImport("@esfx/equatable", "structuralEqualer")
  @js.native
  val structuralEqualer: Equaler[Any] = js.native
  
  /**
    * A default `Comparer` that compares array values rather than the arrays themselves.
    */
  @JSImport("@esfx/equatable", "tupleComparer")
  @js.native
  val tupleComparer: Comparer[js.Array[Any]] = js.native
  
  /**
    * An `Equaler` that compares array values rather than the arrays themselves.
    */
  @JSImport("@esfx/equatable", "tupleEqualer")
  @js.native
  val tupleEqualer: Equaler[js.Array[Any]] = js.native
  
  /**
    * A default `Comparer` that compares array values that may be `StructuralComparable` rather than the arrays themselves.
    */
  @JSImport("@esfx/equatable", "tupleStructuralComparer")
  @js.native
  val tupleStructuralComparer: Comparer[js.Array[Any]] = js.native
  
  /**
    * An `Equaler` that compares array values rather than the arrays themselves.
    */
  @JSImport("@esfx/equatable", "tupleStructuralEqualer")
  @js.native
  val tupleStructuralEqualer: Equaler[js.Array[Any]] = js.native
  
  type Comparison[T] = js.Function2[/* x */ T, /* y */ T, Double]
  
  type EqualityComparison[T] = js.Function2[/* x */ T, /* y */ T, Boolean]
  
  type HashGenerator[T] = js.Function1[/* x */ T, Double]
}
