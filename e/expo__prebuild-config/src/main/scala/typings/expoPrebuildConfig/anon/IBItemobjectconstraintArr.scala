package typings.expoPrebuildConfig.anon

import typings.expoPrebuildConfig.buildPluginsUnversionedExpoSplashScreenInterfaceBuilderMod.IBConstraint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBItem<object, {  constraint :std.Array<@expo/prebuild-config.@expo/prebuild-config/build/plugins/unversioned/expo-splash-screen/InterfaceBuilder.IBConstraint>}> */
trait IBItemobjectconstraintArr extends StObject {
  
  @JSName("$")
  var $: js.Object
  
  var constraint: js.Array[IBConstraint]
}
object IBItemobjectconstraintArr {
  
  inline def apply($: js.Object, constraint: js.Array[IBConstraint]): IBItemobjectconstraintArr = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any], constraint = constraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBItemobjectconstraintArr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBItemobjectconstraintArr] (val x: Self) extends AnyVal {
    
    inline def set$(value: js.Object): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
    
    inline def setConstraint(value: js.Array[IBConstraint]): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setConstraintVarargs(value: IBConstraint*): Self = StObject.set(x, "constraint", js.Array(value*))
  }
}
