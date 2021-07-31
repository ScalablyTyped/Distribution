package typings.esfxEquatable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @js.native
  trait Comparable extends StObject
  object Comparable {
    
    @JSImport("@esfx/equatable/dist", "Comparable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A well-known symbol used to define a relational comparison method on a value.
      */
    @JSImport("@esfx/equatable/dist", "Comparable.compareTo")
    @js.native
    val compareTo: js.Symbol = js.native
    
    /**
      * Determines whether a value is Comparable.
      */
    @scala.inline
    def hasInstance(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.Comparable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/equatable.@esfx/equatable/dist.Comparable */ Boolean]
    
    /**
      * Determines whether a value is Comparable.
      * @deprecated Use `Comparable.hasInstance` instead.
      */
    @scala.inline
    def isComparable(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.Comparable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComparable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/equatable.@esfx/equatable/dist.Comparable */ Boolean]
    
    @JSImport("@esfx/equatable/dist", "Comparable.name")
    @js.native
    val name: /* "Comparable" */ String = js.native
  }
  
  trait Comparer[T] extends StObject {
    
    /**
      * Compares two values:
      * - A negative value indicates `x` is lesser than `y`.
      * - A positive value indicates `x` is greater than `y`.
      * - A zero value indicates `x` and `y` are equivalent.
      */
    def compare(x: T, y: T): Double
  }
  object Comparer {
    
    @scala.inline
    def apply[T](compare: (T, T) => Double): Comparer[T] = {
      val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare))
      __obj.asInstanceOf[Comparer[T]]
    }
    
    @JSImport("@esfx/equatable/dist", "Comparer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a `Comparer` from a comparison function.
      */
    @scala.inline
    def create[T](comparison: Comparison[T]): Comparer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(comparison.asInstanceOf[js.Any]).asInstanceOf[Comparer[T]]
    
    /**
      * The default `Comparer`.
      */
    @JSImport("@esfx/equatable/dist", "Comparer.defaultComparer")
    @js.native
    val defaultComparer: Comparer[js.Any] = js.native
    
    /**
      * A default `Comparer` that supports `StructuralComparable` values.
      */
    @JSImport("@esfx/equatable/dist", "Comparer.structuralComparer")
    @js.native
    val structuralComparer: Comparer[js.Any] = js.native
    
    /**
      * A default `Comparer` that compares array values rather than the arrays themselves.
      */
    @JSImport("@esfx/equatable/dist", "Comparer.tupleComparer")
    @js.native
    val tupleComparer: Comparer[js.Array[js.Any]] = js.native
    
    /**
      * A default `Comparer` that compares array values that may be `StructuralComparable` rather than the arrays themselves.
      */
    @JSImport("@esfx/equatable/dist", "Comparer.tupleStructuralComparer")
    @js.native
    val tupleStructuralComparer: Comparer[js.Array[js.Any]] = js.native
    
    @scala.inline
    implicit class ComparerMutableBuilder[Self <: Comparer[?], T] (val x: Self & Comparer[T]) extends AnyVal {
      
      @scala.inline
      def setCompare(value: (T, T) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    }
  }
  
  trait Equaler[T] extends StObject {
    
    /**
      * Tests whether two values are equal to each other.
      * @param x The first value.
      * @param y The second value.
      */
    def equals(x: T, y: T): Boolean
    
    /**
      * Generates a hash code for a value.
      */
    def hash(x: T): Double
  }
  object Equaler {
    
    @scala.inline
    def apply[T](equals_ : (T, T) => Boolean, hash: T => Double): Equaler[T] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction1(hash))
      __obj.updateDynamic("equals")(js.Any.fromFunction2(equals_))
      __obj.asInstanceOf[Equaler[T]]
    }
    
    @JSImport("@esfx/equatable/dist", "Equaler")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an `Equaler` from a comparison function and an optional hash generator.
      */
    @scala.inline
    def create[T](equalityComparison: EqualityComparison[T]): Equaler[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(equalityComparison.asInstanceOf[js.Any]).asInstanceOf[Equaler[T]]
    @scala.inline
    def create[T](equalityComparison: EqualityComparison[T], hashGenerator: HashGenerator[T]): Equaler[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(equalityComparison.asInstanceOf[js.Any], hashGenerator.asInstanceOf[js.Any])).asInstanceOf[Equaler[T]]
    
    /**
      * Gets the default `Equaler`.
      */
    @JSImport("@esfx/equatable/dist", "Equaler.defaultEqualer")
    @js.native
    val defaultEqualer: Equaler[js.Any] = js.native
    
    /**
      * Gets a default `Equaler` that supports `StructuralEquatable` values.
      */
    @JSImport("@esfx/equatable/dist", "Equaler.structuralEqualer")
    @js.native
    val structuralEqualer: Equaler[js.Any] = js.native
    
    /**
      * An `Equaler` that compares array values rather than the arrays themselves.
      */
    @JSImport("@esfx/equatable/dist", "Equaler.tupleEqualer")
    @js.native
    val tupleEqualer: Equaler[js.Array[js.Any]] = js.native
    
    /**
      * An `Equaler` that compares array values that may be `StructuralEquatable` rather than the arrays themselves.
      */
    @JSImport("@esfx/equatable/dist", "Equaler.tupleStructuralEqualer")
    @js.native
    val tupleStructuralEqualer: Equaler[js.Array[js.Any]] = js.native
    
    @scala.inline
    implicit class EqualerMutableBuilder[Self <: Equaler[?], T] (val x: Self & Equaler[T]) extends AnyVal {
      
      @scala.inline
      def setEquals_(value: (T, T) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHash(value: T => Double): Self = StObject.set(x, "hash", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Equatable extends StObject
  object Equatable {
    
    @JSImport("@esfx/equatable/dist", "Equatable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A well-known symbol used to define an equality test method on a value.
      */
    @JSImport("@esfx/equatable/dist", "Equatable.equals")
    @js.native
    val equals_ : js.Symbol = js.native
    
    /**
      * Determines whether a value is Equatable.
      */
    @scala.inline
    def hasInstance(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.Equatable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/equatable.@esfx/equatable/dist.Equatable */ Boolean]
    
    /**
      * A well-known symbol used to define a hashing method on a value.
      */
    @JSImport("@esfx/equatable/dist", "Equatable.hash")
    @js.native
    val hash: js.Symbol = js.native
    
    /**
      * Determines whether a value is Equatable.
      * @deprecated Use `Equatable.hasInstance` instead.
      */
    @scala.inline
    def isEquatable(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.Equatable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEquatable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/equatable.@esfx/equatable/dist.Equatable */ Boolean]
    
    @JSImport("@esfx/equatable/dist", "Equatable.name")
    @js.native
    val name: /* "Equatable" */ String = js.native
  }
  
  @js.native
  trait StructuralComparable extends StObject
  object StructuralComparable {
    
    @JSImport("@esfx/equatable/dist", "StructuralComparable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Determines whether a value is StructuralComparable.
      */
    @scala.inline
    def hasInstance(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.StructuralComparable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/equatable.@esfx/equatable/dist.StructuralComparable */ Boolean]
    
    /**
      * Determines whether a value is StructuralComparable.
      * @deprecated Use `StructuralComparable.hasInstance` instead.
      */
    @scala.inline
    def isStructuralComparable(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.StructuralComparable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStructuralComparable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/equatable.@esfx/equatable/dist.StructuralComparable */ Boolean]
    
    @JSImport("@esfx/equatable/dist", "StructuralComparable.name")
    @js.native
    val name: /* "StructuralComparable" */ String = js.native
    
    /**
      * A well-known symbol used to define a structural comparison method on a value.
      */
    @JSImport("@esfx/equatable/dist", "StructuralComparable.structuralCompareTo")
    @js.native
    val structuralCompareTo: js.Symbol = js.native
  }
  
  @js.native
  trait StructuralEquatable extends StObject
  object StructuralEquatable {
    
    @JSImport("@esfx/equatable/dist", "StructuralEquatable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Determines whether a value is StructuralEquatable.
      */
    @scala.inline
    def hasInstance(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.StructuralEquatable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/equatable.@esfx/equatable/dist.StructuralEquatable */ Boolean]
    
    /**
      * Determines whether a value is StructuralEquatable.
      * @deprecated Use `StructuralEquatable.hasInstance` instead.
      */
    @scala.inline
    def isStructuralEquatable(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.StructuralEquatable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStructuralEquatable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/equatable.@esfx/equatable/dist.StructuralEquatable */ Boolean]
    
    @JSImport("@esfx/equatable/dist", "StructuralEquatable.name")
    @js.native
    val name: /* "StructuralEquatable" */ String = js.native
    
    /**
      * A well-known symbol used to define a structural equality test method on a value.
      */
    @JSImport("@esfx/equatable/dist", "StructuralEquatable.structuralEquals")
    @js.native
    val structuralEquals: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define a structural hashing method on a value.
      */
    @JSImport("@esfx/equatable/dist", "StructuralEquatable.structuralHash")
    @js.native
    val structuralHash: js.Symbol = js.native
  }
  
  type Comparison[T] = js.Function2[/* x */ T, /* y */ T, Double]
  
  type EqualityComparison[T] = js.Function2[/* x */ T, /* y */ T, Boolean]
  
  type HashGenerator[T] = js.Function1[/* x */ T, Double]
}
