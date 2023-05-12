package typings.glimmerInterfaces

import typings.glimmerInterfaces.anon.DisableAutoTracking
import typings.glimmerInterfaces.distTypesLibManagersCapabilitiesMod.Capabilities
import typings.glimmerInterfaces.distTypesLibRuntimeArgumentsMod.Arguments
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibManagersModifierMod {
  
  @js.native
  trait ModifierCapabilities
    extends StObject
       with Capabilities {
    
    var disableAutoTracking: Boolean = js.native
  }
  
  trait ModifierCapabilitiesVersions extends StObject {
    
    // passes factoryFor(...).class to `.createModifier`
    // uses args proxy, does not provide a way to opt-out
    @JSName("3.22")
    var `3Dot22`: DisableAutoTracking
  }
  object ModifierCapabilitiesVersions {
    
    inline def apply(`3Dot22`: DisableAutoTracking): ModifierCapabilitiesVersions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("3.22")(`3Dot22`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModifierCapabilitiesVersions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModifierCapabilitiesVersions] (val x: Self) extends AnyVal {
      
      inline def set3Dot22(value: DisableAutoTracking): Self = StObject.set(x, "3.22", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModifierManager[ModifierStateBucket] extends StObject {
    
    var capabilities: ModifierCapabilities
    
    def createModifier(factory: Any, args: Arguments): ModifierStateBucket
    
    def destroyModifier(instance: ModifierStateBucket, args: Arguments): Unit
    
    def installModifier(instance: ModifierStateBucket, element: Element, args: Arguments): Unit
    
    def updateModifier(instance: ModifierStateBucket, args: Arguments): Unit
  }
  object ModifierManager {
    
    inline def apply[ModifierStateBucket](
      capabilities: ModifierCapabilities,
      createModifier: (Any, Arguments) => ModifierStateBucket,
      destroyModifier: (ModifierStateBucket, Arguments) => Unit,
      installModifier: (ModifierStateBucket, Element, Arguments) => Unit,
      updateModifier: (ModifierStateBucket, Arguments) => Unit
    ): ModifierManager[ModifierStateBucket] = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], createModifier = js.Any.fromFunction2(createModifier), destroyModifier = js.Any.fromFunction2(destroyModifier), installModifier = js.Any.fromFunction3(installModifier), updateModifier = js.Any.fromFunction2(updateModifier))
      __obj.asInstanceOf[ModifierManager[ModifierStateBucket]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModifierManager[?], ModifierStateBucket] (val x: Self & ModifierManager[ModifierStateBucket]) extends AnyVal {
      
      inline def setCapabilities(value: ModifierCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCreateModifier(value: (Any, Arguments) => ModifierStateBucket): Self = StObject.set(x, "createModifier", js.Any.fromFunction2(value))
      
      inline def setDestroyModifier(value: (ModifierStateBucket, Arguments) => Unit): Self = StObject.set(x, "destroyModifier", js.Any.fromFunction2(value))
      
      inline def setInstallModifier(value: (ModifierStateBucket, Element, Arguments) => Unit): Self = StObject.set(x, "installModifier", js.Any.fromFunction3(value))
      
      inline def setUpdateModifier(value: (ModifierStateBucket, Arguments) => Unit): Self = StObject.set(x, "updateModifier", js.Any.fromFunction2(value))
    }
  }
}
