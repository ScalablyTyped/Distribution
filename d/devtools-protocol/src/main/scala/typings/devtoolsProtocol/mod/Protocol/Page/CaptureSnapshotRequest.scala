package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.devtoolsProtocolStrings.mhtml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureSnapshotRequest extends StObject {
  
  /**
    * Format (defaults to mhtml). (CaptureSnapshotRequestFormat enum)
    */
  var format: js.UndefOr[mhtml] = js.undefined
}
object CaptureSnapshotRequest {
  
  @scala.inline
  def apply(): CaptureSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureSnapshotRequest]
  }
  
  @scala.inline
  implicit class CaptureSnapshotRequestMutableBuilder[Self <: CaptureSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: mhtml): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
