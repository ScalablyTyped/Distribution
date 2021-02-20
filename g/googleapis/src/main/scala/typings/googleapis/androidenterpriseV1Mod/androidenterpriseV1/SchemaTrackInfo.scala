package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Id to name association of a track.
  */
@js.native
trait SchemaTrackInfo extends StObject {
  
  /**
    * A modifiable name for a track. This is the visible name in the play
    * developer console.
    */
  var trackAlias: js.UndefOr[String] = js.native
  
  /**
    * Unmodifiable, unique track identifier. This identifier is the
    * releaseTrackId in the url of the play developer console page that
    * displays the track information.
    */
  var trackId: js.UndefOr[String] = js.native
}
object SchemaTrackInfo {
  
  @scala.inline
  def apply(): SchemaTrackInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrackInfo]
  }
  
  @scala.inline
  implicit class SchemaTrackInfoMutableBuilder[Self <: SchemaTrackInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrackAlias(value: String): Self = StObject.set(x, "trackAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackAliasUndefined: Self = StObject.set(x, "trackAlias", js.undefined)
    
    @scala.inline
    def setTrackId(value: String): Self = StObject.set(x, "trackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackIdUndefined: Self = StObject.set(x, "trackId", js.undefined)
  }
}
