package typings.glimmerInterfaces

import typings.glimmerInterfaces.anon.HasDestroyable
import typings.glimmerInterfaces.distTypesLibManagersCapabilitiesMod.Capabilities
import typings.glimmerInterfaces.distTypesLibRuntimeArgumentsMod.Arguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibManagersHelperMod {
  
  @js.native
  trait HelperCapabilities
    extends StObject
       with Capabilities {
    
    var hasDestroyable: Boolean = js.native
    
    var hasScheduledEffect: Boolean = js.native
    
    var hasValue: Boolean = js.native
  }
  
  trait HelperCapabilitiesVersions extends StObject {
    
    @JSName("3.23")
    var `3Dot23`: HasDestroyable
  }
  object HelperCapabilitiesVersions {
    
    inline def apply(`3Dot23`: HasDestroyable): HelperCapabilitiesVersions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("3.23")(`3Dot23`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelperCapabilitiesVersions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelperCapabilitiesVersions] (val x: Self) extends AnyVal {
      
      inline def set3Dot23(value: HasDestroyable): Self = StObject.set(x, "3.23", value.asInstanceOf[js.Any])
    }
  }
  
  trait HelperManager[HelperStateBucket] extends StObject {
    
    var capabilities: HelperCapabilities
    
    def createHelper(definition: js.Object, args: Arguments): HelperStateBucket
    
    var getDebugName: js.UndefOr[js.Function1[/* definition */ js.Object, String]] = js.undefined
  }
  object HelperManager {
    
    inline def apply[HelperStateBucket](capabilities: HelperCapabilities, createHelper: (js.Object, Arguments) => HelperStateBucket): HelperManager[HelperStateBucket] = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], createHelper = js.Any.fromFunction2(createHelper))
      __obj.asInstanceOf[HelperManager[HelperStateBucket]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelperManager[?], HelperStateBucket] (val x: Self & HelperManager[HelperStateBucket]) extends AnyVal {
      
      inline def setCapabilities(value: HelperCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
      
      inline def setCreateHelper(value: (js.Object, Arguments) => HelperStateBucket): Self = StObject.set(x, "createHelper", js.Any.fromFunction2(value))
      
      inline def setGetDebugName(value: /* definition */ js.Object => String): Self = StObject.set(x, "getDebugName", js.Any.fromFunction1(value))
      
      inline def setGetDebugNameUndefined: Self = StObject.set(x, "getDebugName", js.undefined)
    }
  }
  
  trait HelperManagerWithDestroyable[HelperStateBucket]
    extends StObject
       with HelperManager[HelperStateBucket] {
    
    def getDestroyable(bucket: HelperStateBucket): js.Object
  }
  object HelperManagerWithDestroyable {
    
    inline def apply[HelperStateBucket](
      capabilities: HelperCapabilities,
      createHelper: (js.Object, Arguments) => HelperStateBucket,
      getDestroyable: HelperStateBucket => js.Object
    ): HelperManagerWithDestroyable[HelperStateBucket] = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], createHelper = js.Any.fromFunction2(createHelper), getDestroyable = js.Any.fromFunction1(getDestroyable))
      __obj.asInstanceOf[HelperManagerWithDestroyable[HelperStateBucket]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelperManagerWithDestroyable[?], HelperStateBucket] (val x: Self & HelperManagerWithDestroyable[HelperStateBucket]) extends AnyVal {
      
      inline def setGetDestroyable(value: HelperStateBucket => js.Object): Self = StObject.set(x, "getDestroyable", js.Any.fromFunction1(value))
    }
  }
  
  trait HelperManagerWithValue[HelperStateBucket]
    extends StObject
       with HelperManager[HelperStateBucket] {
    
    def getValue(bucket: HelperStateBucket): Any
  }
  object HelperManagerWithValue {
    
    inline def apply[HelperStateBucket](
      capabilities: HelperCapabilities,
      createHelper: (js.Object, Arguments) => HelperStateBucket,
      getValue: HelperStateBucket => Any
    ): HelperManagerWithValue[HelperStateBucket] = {
      val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], createHelper = js.Any.fromFunction2(createHelper), getValue = js.Any.fromFunction1(getValue))
      __obj.asInstanceOf[HelperManagerWithValue[HelperStateBucket]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelperManagerWithValue[?], HelperStateBucket] (val x: Self & HelperManagerWithValue[HelperStateBucket]) extends AnyVal {
      
      inline def setGetValue(value: HelperStateBucket => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    }
  }
}
