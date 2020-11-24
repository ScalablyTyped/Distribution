package typings.esfxEquatable

import typings.esfxEquatable.distMod.Comparison
import typings.esfxEquatable.distMod.EqualityComparison
import typings.esfxEquatable.distMod.HashGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@esfx/equatable", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object Comparable extends js.Object {
    
    /**
      * A well-known symbol used to define a relational comparison method on a value.
      */
    val compareTo: js.Symbol = js.native
    
    /**
      * Determines whether a value is Comparable.
      */
    def hasInstance(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.Comparable */ Boolean = js.native
    
    /**
      * Determines whether a value is Comparable.
      * @deprecated Use `Comparable.hasInstance` instead.
      */
    def isComparable(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.Comparable */ Boolean = js.native
    
    val name: /* "Comparable" */ String = js.native
  }
  
  @js.native
  object Comparer extends js.Object {
    
    /**
      * Creates a `Comparer` from a comparison function.
      */
    def create[T](comparison: Comparison[T]): typings.esfxEquatable.distMod.Comparer[T] = js.native
    
    /**
      * The default `Comparer`.
      */
    val defaultComparer: typings.esfxEquatable.distMod.Comparer[js.Any] = js.native
    
    /**
      * A default `Comparer` that supports `StructuralComparable` values.
      */
    val structuralComparer: typings.esfxEquatable.distMod.Comparer[js.Any] = js.native
    
    /**
      * A default `Comparer` that compares array values rather than the arrays themselves.
      */
    val tupleComparer: typings.esfxEquatable.distMod.Comparer[js.Array[js.Any]] = js.native
    
    /**
      * A default `Comparer` that compares array values that may be `StructuralComparable` rather than the arrays themselves.
      */
    val tupleStructuralComparer: typings.esfxEquatable.distMod.Comparer[js.Array[js.Any]] = js.native
  }
  
  @js.native
  object Equaler extends js.Object {
    
    /**
      * Creates an `Equaler` from a comparison function and an optional hash generator.
      */
    def create[T](equalityComparison: EqualityComparison[T]): typings.esfxEquatable.distMod.Equaler[T] = js.native
    def create[T](equalityComparison: EqualityComparison[T], hashGenerator: HashGenerator[T]): typings.esfxEquatable.distMod.Equaler[T] = js.native
    
    /**
      * Gets the default `Equaler`.
      */
    val defaultEqualer: typings.esfxEquatable.distMod.Equaler[js.Any] = js.native
    
    /**
      * Gets a default `Equaler` that supports `StructuralEquatable` values.
      */
    val structuralEqualer: typings.esfxEquatable.distMod.Equaler[js.Any] = js.native
    
    /**
      * An `Equaler` that compares array values rather than the arrays themselves.
      */
    val tupleEqualer: typings.esfxEquatable.distMod.Equaler[js.Array[js.Any]] = js.native
    
    /**
      * An `Equaler` that compares array values that may be `StructuralEquatable` rather than the arrays themselves.
      */
    val tupleStructuralEqualer: typings.esfxEquatable.distMod.Equaler[js.Array[js.Any]] = js.native
  }
  
  @js.native
  object Equatable extends js.Object {
    
    /**
      * A well-known symbol used to define an equality test method on a value.
      */
    @JSName("equals")
    val equals_FEquatable: js.Symbol = js.native
    
    /**
      * Determines whether a value is Equatable.
      */
    def hasInstance(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.Equatable */ Boolean = js.native
    
    /**
      * A well-known symbol used to define a hashing method on a value.
      */
    val hash: js.Symbol = js.native
    
    /**
      * Determines whether a value is Equatable.
      * @deprecated Use `Equatable.hasInstance` instead.
      */
    def isEquatable(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.Equatable */ Boolean = js.native
    
    val name: /* "Equatable" */ String = js.native
  }
  
  @js.native
  object StructuralComparable extends js.Object {
    
    /**
      * Determines whether a value is StructuralComparable.
      */
    def hasInstance(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.StructuralComparable */ Boolean = js.native
    
    /**
      * Determines whether a value is StructuralComparable.
      * @deprecated Use `StructuralComparable.hasInstance` instead.
      */
    def isStructuralComparable(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.StructuralComparable */ Boolean = js.native
    
    val name: /* "StructuralComparable" */ String = js.native
    
    /**
      * A well-known symbol used to define a structural comparison method on a value.
      */
    val structuralCompareTo: js.Symbol = js.native
  }
  
  @js.native
  object StructuralEquatable extends js.Object {
    
    /**
      * Determines whether a value is StructuralEquatable.
      */
    def hasInstance(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.StructuralEquatable */ Boolean = js.native
    
    /**
      * Determines whether a value is StructuralEquatable.
      * @deprecated Use `StructuralEquatable.hasInstance` instead.
      */
    def isStructuralEquatable(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.StructuralEquatable */ Boolean = js.native
    
    val name: /* "StructuralEquatable" */ String = js.native
    
    /**
      * A well-known symbol used to define a structural equality test method on a value.
      */
    val structuralEquals: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define a structural hashing method on a value.
      */
    val structuralHash: js.Symbol = js.native
  }
}
