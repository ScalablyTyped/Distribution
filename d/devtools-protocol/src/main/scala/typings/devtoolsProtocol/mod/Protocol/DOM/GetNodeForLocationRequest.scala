package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNodeForLocationRequest extends StObject {
  
  /**
    * Whether to ignore pointer-events: none on elements and hit test them.
    */
  var ignorePointerEventsNone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * False to skip to the nearest non-UA shadow root ancestor (default: false).
    */
  var includeUserAgentShadowDOM: js.UndefOr[Boolean] = js.undefined
  
  /**
    * X coordinate.
    */
  var x: integer
  
  /**
    * Y coordinate.
    */
  var y: integer
}
object GetNodeForLocationRequest {
  
  @scala.inline
  def apply(x: integer, y: integer): GetNodeForLocationRequest = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNodeForLocationRequest]
  }
  
  @scala.inline
  implicit class GetNodeForLocationRequestMutableBuilder[Self <: GetNodeForLocationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnorePointerEventsNone(value: Boolean): Self = StObject.set(x, "ignorePointerEventsNone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnorePointerEventsNoneUndefined: Self = StObject.set(x, "ignorePointerEventsNone", js.undefined)
    
    @scala.inline
    def setIncludeUserAgentShadowDOM(value: Boolean): Self = StObject.set(x, "includeUserAgentShadowDOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUserAgentShadowDOMUndefined: Self = StObject.set(x, "includeUserAgentShadowDOM", js.undefined)
    
    @scala.inline
    def setX(value: integer): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: integer): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
