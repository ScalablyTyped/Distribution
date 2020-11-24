package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTrackRelease extends js.Object {
  
  var countryTargeting: js.UndefOr[SchemaCountryTargeting] = js.native
  
  /**
    * The release name, used to identify this release in the Play Console UI.
    * Not required to be unique. This is optional, if not set it will be
    * generated from the version_name in the APKs.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The description of what is new in the app in this release.
    */
  var releaseNotes: js.UndefOr[js.Array[SchemaLocalizedText]] = js.native
  
  /**
    * The desired status of this release.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * Fraction of users who are eligible to receive the release. 0 &lt;
    * fraction &lt; 1. To be set, release status must be &quot;inProgress&quot;
    * or &quot;halted&quot;.
    */
  var userFraction: js.UndefOr[Double] = js.native
  
  /**
    * A list of all version codes of APKs that will be exposed to the users of
    * this track when this release is rolled out. Note that this list should
    * contain all versions you wish to be active, including those you wish to
    * retain from previous releases.
    */
  var versionCodes: js.UndefOr[js.Array[String]] = js.native
}
object SchemaTrackRelease {
  
  @scala.inline
  def apply(): SchemaTrackRelease = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrackRelease]
  }
  
  @scala.inline
  implicit class SchemaTrackReleaseOps[Self <: SchemaTrackRelease] (val x: Self) extends AnyVal {
    
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
    def setCountryTargeting(value: SchemaCountryTargeting): Self = this.set("countryTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryTargeting: Self = this.set("countryTargeting", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setReleaseNotesVarargs(value: SchemaLocalizedText*): Self = this.set("releaseNotes", js.Array(value :_*))
    
    @scala.inline
    def setReleaseNotes(value: js.Array[SchemaLocalizedText]): Self = this.set("releaseNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseNotes: Self = this.set("releaseNotes", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUserFraction(value: Double): Self = this.set("userFraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserFraction: Self = this.set("userFraction", js.undefined)
    
    @scala.inline
    def setVersionCodesVarargs(value: String*): Self = this.set("versionCodes", js.Array(value :_*))
    
    @scala.inline
    def setVersionCodes(value: js.Array[String]): Self = this.set("versionCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionCodes: Self = this.set("versionCodes", js.undefined)
  }
}
