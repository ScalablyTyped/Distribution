package typings.devtoolsProtocol.mod.Protocol.Target

import typings.devtoolsProtocol.mod.Protocol.Browser.BrowserContextID
import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetInfo extends StObject {
  
  /**
    * Whether the target has an attached client.
    */
  var attached: Boolean
  
  var browserContextId: js.UndefOr[BrowserContextID] = js.undefined
  
  /**
    * Whether the target has access to the originating window.
    */
  var canAccessOpener: Boolean
  
  /**
    * Frame id of originating window (is only set if target has an opener).
    */
  var openerFrameId: js.UndefOr[FrameId] = js.undefined
  
  /**
    * Opener target Id
    */
  var openerId: js.UndefOr[TargetID] = js.undefined
  
  /**
    * Provides additional details for specific target types. For example, for
    * the type of "page", this may be set to "portal" or "prerender".
    */
  var subtype: js.UndefOr[String] = js.undefined
  
  var targetId: TargetID
  
  var title: String
  
  var `type`: String
  
  var url: String
}
object TargetInfo {
  
  inline def apply(
    attached: Boolean,
    canAccessOpener: Boolean,
    targetId: TargetID,
    title: String,
    `type`: String,
    url: String
  ): TargetInfo = {
    val __obj = js.Dynamic.literal(attached = attached.asInstanceOf[js.Any], canAccessOpener = canAccessOpener.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetInfo] (val x: Self) extends AnyVal {
    
    inline def setAttached(value: Boolean): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
    
    inline def setBrowserContextId(value: BrowserContextID): Self = StObject.set(x, "browserContextId", value.asInstanceOf[js.Any])
    
    inline def setBrowserContextIdUndefined: Self = StObject.set(x, "browserContextId", js.undefined)
    
    inline def setCanAccessOpener(value: Boolean): Self = StObject.set(x, "canAccessOpener", value.asInstanceOf[js.Any])
    
    inline def setOpenerFrameId(value: FrameId): Self = StObject.set(x, "openerFrameId", value.asInstanceOf[js.Any])
    
    inline def setOpenerFrameIdUndefined: Self = StObject.set(x, "openerFrameId", js.undefined)
    
    inline def setOpenerId(value: TargetID): Self = StObject.set(x, "openerId", value.asInstanceOf[js.Any])
    
    inline def setOpenerIdUndefined: Self = StObject.set(x, "openerId", js.undefined)
    
    inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    inline def setTargetId(value: TargetID): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
