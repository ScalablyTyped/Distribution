package typings.googleCloudPubsub.protosMod.google.protobuf

import typings.googleCloudPubsub.protosMod.google.protobuf.SourceCodeInfo.ILocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SourceCodeInfo. */
@js.native
trait ISourceCodeInfo extends StObject {
  
  /** SourceCodeInfo location */
  var location: js.UndefOr[js.Array[ILocation] | Null] = js.native
}
object ISourceCodeInfo {
  
  @scala.inline
  def apply(): ISourceCodeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISourceCodeInfo]
  }
  
  @scala.inline
  implicit class ISourceCodeInfoMutableBuilder[Self <: ISourceCodeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: js.Array[ILocation]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationNull: Self = StObject.set(x, "location", null)
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setLocationVarargs(value: ILocation*): Self = StObject.set(x, "location", js.Array(value :_*))
  }
}
