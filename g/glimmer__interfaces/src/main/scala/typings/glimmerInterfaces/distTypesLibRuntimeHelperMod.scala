package typings.glimmerInterfaces

import typings.glimmerInterfaces.distTypesLibRuntimeArgumentsMod.CapturedArguments
import typings.glimmerInterfaces.distTypesLibRuntimeOwnerMod.Owner
import typings.glimmerInterfaces.distTypesLibRuntimeScopeMod.DynamicScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibRuntimeHelperMod {
  
  type Helper[O /* <: Owner */] = js.Function3[
    /* args */ CapturedArguments, 
    /* owner */ js.UndefOr[O], 
    /* dynamicScope */ js.UndefOr[DynamicScope], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reference */ Any
  ]
  
  type HelperDefinitionState = js.Object
}
