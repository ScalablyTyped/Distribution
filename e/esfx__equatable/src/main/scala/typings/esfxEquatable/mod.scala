package typings.esfxEquatable

import typings.esfxEquatable.distMod.Comparison
import typings.esfxEquatable.distMod.EqualityComparison
import typings.esfxEquatable.distMod.HashGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
      */
    @scala.inline
    def hasInstance(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.Comparable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/equatable.@esfx/equatable/dist.Comparable */ Boolean]
    
    /**
      * Determines whether a value is Comparable.
      * @deprecated Use `Comparable.hasInstance` instead.
      */
    @scala.inline
    def isComparable(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.Comparable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComparable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/equatable.@esfx/equatable/dist.Comparable */ Boolean]
    
    @JSImport("@esfx/equatable", "Comparable.name")
    @js.native
    val name: /* "Comparable" */ String = js.native
  }
  
  object Comparer {
    
    @JSImport("@esfx/equatable", "Comparer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a `Comparer` from a comparison function.
      */
    @scala.inline
    def create[T](comparison: Comparison[T]): typings.esfxEquatable.distMod.Comparer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(comparison.asInstanceOf[js.Any]).asInstanceOf[typings.esfxEquatable.distMod.Comparer[T]]
    
    /**
      * The default `Comparer`.
      */
    @JSImport("@esfx/equatable", "Comparer.defaultComparer")
    @js.native
    val defaultComparer: typings.esfxEquatable.distMod.Comparer[js.Any] = js.native
    
    /**
      * A default `Comparer` that supports `StructuralComparable` values.
      */
    @JSImport("@esfx/equatable", "Comparer.structuralComparer")
    @js.native
    val structuralComparer: typings.esfxEquatable.distMod.Comparer[js.Any] = js.native
    
    /**
      * A default `Comparer` that compares array values rather than the arrays themselves.
      */
    @JSImport("@esfx/equatable", "Comparer.tupleComparer")
    @js.native
    val tupleComparer: typings.esfxEquatable.distMod.Comparer[js.Array[js.Any]] = js.native
    
    /**
      * A default `Comparer` that compares array values that may be `StructuralComparable` rather than the arrays themselves.
      */
    @JSImport("@esfx/equatable", "Comparer.tupleStructuralComparer")
    @js.native
    val tupleStructuralComparer: typings.esfxEquatable.distMod.Comparer[js.Array[js.Any]] = js.native
  }
  
  object Equaler {
    
    @JSImport("@esfx/equatable", "Equaler")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an `Equaler` from a comparison function and an optional hash generator.
      */
    @scala.inline
    def create[T](equalityComparison: EqualityComparison[T]): typings.esfxEquatable.distMod.Equaler[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(equalityComparison.asInstanceOf[js.Any]).asInstanceOf[typings.esfxEquatable.distMod.Equaler[T]]
    @scala.inline
    def create[T](equalityComparison: EqualityComparison[T], hashGenerator: HashGenerator[T]): typings.esfxEquatable.distMod.Equaler[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(equalityComparison.asInstanceOf[js.Any], hashGenerator.asInstanceOf[js.Any])).asInstanceOf[typings.esfxEquatable.distMod.Equaler[T]]
    
    /**
      * Gets the default `Equaler`.
      */
    @JSImport("@esfx/equatable", "Equaler.defaultEqualer")
    @js.native
    val defaultEqualer: typings.esfxEquatable.distMod.Equaler[js.Any] = js.native
    
    /**
      * Gets a default `Equaler` that supports `StructuralEquatable` values.
      */
    @JSImport("@esfx/equatable", "Equaler.structuralEqualer")
    @js.native
    val structuralEqualer: typings.esfxEquatable.distMod.Equaler[js.Any] = js.native
    
    /**
      * An `Equaler` that compares array values rather than the arrays themselves.
      */
    @JSImport("@esfx/equatable", "Equaler.tupleEqualer")
    @js.native
    val tupleEqualer: typings.esfxEquatable.distMod.Equaler[js.Array[js.Any]] = js.native
    
    /**
      * An `Equaler` that compares array values that may be `StructuralEquatable` rather than the arrays themselves.
      */
    @JSImport("@esfx/equatable", "Equaler.tupleStructuralEqualer")
    @js.native
    val tupleStructuralEqualer: typings.esfxEquatable.distMod.Equaler[js.Array[js.Any]] = js.native
  }
  
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
      */
    @scala.inline
    def hasInstance(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.Equatable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasInstance")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/equatable.@esfx/equatable/dist.Equatable */ Boolean]
    
    /**
      * A well-known symbol used to define a hashing method on a value.
      */
    @JSImport("@esfx/equatable", "Equatable.hash")
    @js.native
    val hash: js.Symbol = js.native
    
    /**
      * Determines whether a value is Equatable.
      * @deprecated Use `Equatable.hasInstance` instead.
      */
    @scala.inline
    def isEquatable(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.Equatable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEquatable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @esfx/equatable.@esfx/equatable/dist.Equatable */ Boolean]
    
    @JSImport("@esfx/equatable", "Equatable.name")
    @js.native
    val name: /* "Equatable" */ String = js.native
  }
  
  object StructuralComparable {
    
    @JSImport("@esfx/equatable", "StructuralComparable")
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
  
  object StructuralEquatable {
    
    @JSImport("@esfx/equatable", "StructuralEquatable")
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
}
