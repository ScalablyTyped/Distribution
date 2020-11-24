package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This represents a single version of the app.
  */
@js.native
trait SchemaAppVersion extends js.Object {
  
  /**
    * True if this version is a production APK.
    */
  var isProduction: js.UndefOr[Boolean] = js.native
  
  /**
    * Deprecated, use trackId instead.
    */
  var track: js.UndefOr[String] = js.native
  
  /**
    * Track ids that the app version is published in. Replaces the track field
    * (deprecated), but doesn&#39;t include the production track (see
    * isProduction instead).
    */
  var trackId: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Unique increasing identifier for the app version.
    */
  var versionCode: js.UndefOr[Double] = js.native
  
  /**
    * The string used in the Play store by the app developer to identify the
    * version. The string is not necessarily unique or localized (for example,
    * the string could be &quot;1.4&quot;).
    */
  var versionString: js.UndefOr[String] = js.native
}
object SchemaAppVersion {
  
  @scala.inline
  def apply(): SchemaAppVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppVersion]
  }
  
  @scala.inline
  implicit class SchemaAppVersionOps[Self <: SchemaAppVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsProduction(value: Boolean): Self = this.set("isProduction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsProduction: Self = this.set("isProduction", js.undefined)
    
    @scala.inline
    def setTrack(value: String): Self = this.set("track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
    
    @scala.inline
    def setTrackIdVarargs(value: String*): Self = this.set("trackId", js.Array(value :_*))
    
    @scala.inline
    def setTrackId(value: js.Array[String]): Self = this.set("trackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackId: Self = this.set("trackId", js.undefined)
    
    @scala.inline
    def setVersionCode(value: Double): Self = this.set("versionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionCode: Self = this.set("versionCode", js.undefined)
    
    @scala.inline
    def setVersionString(value: String): Self = this.set("versionString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionString: Self = this.set("versionString", js.undefined)
  }
}
