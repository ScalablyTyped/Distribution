package typings.esfxTypeModel

import typings.esfxTypeModel.mod.And
import typings.esfxTypeModel.mod.IsAny
import typings.esfxTypeModel.mod.IsNever
import typings.esfxTypeModel.mod.IsUnknown
import typings.esfxTypeModel.mod.Not
import typings.esfxTypeModel.mod.Or
import typings.esfxTypeModel.mod.Overlaps
import typings.esfxTypeModel.mod.Relatable
import typings.esfxTypeModel.mod._Falsy
import typings.esfxTypeModel.mod._IsCallable
import typings.esfxTypeModel.mod._IsConstructable
import typings.esfxTypeModel.mod._IsProperSubsetOf
import typings.esfxTypeModel.mod._IsSubsetOf
import typings.esfxTypeModel.mod._OneRest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esfxTypeModelBooleans {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.esfxTypeModel.mod.SameType because Already inherited
  - typings.esfxTypeModel.mod.IsSubtypeOf because Already inherited */ @js.native
  sealed trait `false`
    extends StObject
       with And[Any, Any]
       with IsAny[Any]
       with IsNever[Any]
       with IsUnknown[Any]
       with Not[Any]
       with Or[Any, Any]
       with Overlaps[Any, Any]
       with Relatable[Any, Any]
       with _Falsy
       with _IsCallable[Any]
       with _IsConstructable[Any]
       with _IsProperSubsetOf[Any, Any]
       with _IsSubsetOf[Any, Any]
       with _OneRest[Any]
  inline def `false`: `false` = false.asInstanceOf[`false`]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.esfxTypeModel.mod.SameType because Already inherited
  - typings.esfxTypeModel.mod.IsSubtypeOf because Already inherited */ @js.native
  sealed trait `true`
    extends StObject
       with And[Any, Any]
       with IsAny[Any]
       with IsNever[Any]
       with IsUnknown[Any]
       with Not[Any]
       with Or[Any, Any]
       with Overlaps[Any, Any]
       with Relatable[Any, Any]
       with _IsCallable[Any]
       with _IsConstructable[Any]
       with _IsSubsetOf[Any, Any]
       with _OneRest[Any]
  inline def `true`: `true` = true.asInstanceOf[`true`]
}
