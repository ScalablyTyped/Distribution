package typings.emberTestWaiters

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait For extends StObject {
    
    /**
      * A namespace for the deprecation, usually the package name
      */
    var `for`: String
    
    /**
      * A unique id for this deprecation. The id can be used by Ember debugging
      * tools to change the behavior (raise, log or silence) for that specific
      * deprecation. The id should be namespaced by dots, e.g.
      * `"view.helper.select"`.
      */
    var id: String
    
    /**
      * Describes when the deprecation became available and enabled
      */
    var since: PartialRecordDeprecationS
    
    /**
      * The version of Ember when this deprecation warning will be removed.
      */
    var until: String
    
    /**
      * An optional url to the transition guide on the emberjs.com website.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object For {
    
    inline def apply(`for`: String, id: String, since: PartialRecordDeprecationS, until: String): For = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], until = until.asInstanceOf[js.Any])
      __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
      __obj.asInstanceOf[For]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: For] (val x: Self) extends AnyVal {
      
      inline def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSince(value: PartialRecordDeprecationS): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
      
      inline def setUntil(value: String): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Record<@ember/test-waiters.@ember/test-waiters/types/custom-ember-debug.DeprecationStages, string>> */
  trait PartialRecordDeprecationS extends StObject {
    
    var available: js.UndefOr[String] = js.undefined
    
    var enabled: js.UndefOr[String] = js.undefined
  }
  object PartialRecordDeprecationS {
    
    inline def apply(): PartialRecordDeprecationS = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordDeprecationS]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRecordDeprecationS] (val x: Self) extends AnyVal {
      
      inline def setAvailable(value: String): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
      
      inline def setEnabled(value: String): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    }
  }
}
