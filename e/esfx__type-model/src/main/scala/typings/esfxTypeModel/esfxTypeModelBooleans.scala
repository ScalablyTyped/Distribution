package typings.esfxTypeModel

import typings.esfxTypeModel.distMod.And
import typings.esfxTypeModel.distMod.IsAny
import typings.esfxTypeModel.distMod.IsNever
import typings.esfxTypeModel.distMod.IsUnknown
import typings.esfxTypeModel.distMod.Not
import typings.esfxTypeModel.distMod.Or
import typings.esfxTypeModel.distMod.Overlaps
import typings.esfxTypeModel.distMod.Relatable
import typings.esfxTypeModel.distMod._Falsey
import typings.esfxTypeModel.distMod._IsCallable
import typings.esfxTypeModel.distMod._IsConstructable
import typings.esfxTypeModel.distMod._IsProperSubsetOf
import typings.esfxTypeModel.distMod._IsSubsetOf
import typings.esfxTypeModel.distMod._OneRest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esfxTypeModelBooleans {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.esfxTypeModel.distMod.SameType because Already inherited
  - typings.esfxTypeModel.distMod.IsSubtypeOf because Already inherited */ @js.native
  sealed trait `false`
    extends StObject
       with And[js.Any, js.Any]
       with IsAny[js.Any]
       with IsNever[js.Any]
       with IsUnknown[js.Any]
       with Not[js.Any]
       with Or[js.Any, js.Any]
       with Overlaps[js.Any, js.Any]
       with Relatable[js.Any, js.Any]
       with _Falsey
       with _IsCallable[js.Any]
       with _IsConstructable[js.Any]
       with _IsProperSubsetOf[js.Any, js.Any]
       with _IsSubsetOf[js.Any, js.Any]
       with _OneRest[js.Any]
  inline def `false`: `false` = false.asInstanceOf[`false`]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.esfxTypeModel.distMod.SameType because Already inherited
  - typings.esfxTypeModel.distMod.IsSubtypeOf because Already inherited */ @js.native
  sealed trait `true`
    extends StObject
       with And[js.Any, js.Any]
       with IsAny[js.Any]
       with IsNever[js.Any]
       with IsUnknown[js.Any]
       with Not[js.Any]
       with Or[js.Any, js.Any]
       with Overlaps[js.Any, js.Any]
       with Relatable[js.Any, js.Any]
       with _IsCallable[js.Any]
       with _IsConstructable[js.Any]
       with _IsSubsetOf[js.Any, js.Any]
       with _OneRest[js.Any]
  inline def `true`: `true` = true.asInstanceOf[`true`]
}
