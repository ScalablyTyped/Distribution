package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTrackRelease extends StObject {
  
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
  implicit class SchemaTrackReleaseMutableBuilder[Self <: SchemaTrackRelease] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountryTargeting(value: SchemaCountryTargeting): Self = StObject.set(x, "countryTargeting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryTargetingUndefined: Self = StObject.set(x, "countryTargeting", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReleaseNotes(value: js.Array[SchemaLocalizedText]): Self = StObject.set(x, "releaseNotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseNotesUndefined: Self = StObject.set(x, "releaseNotes", js.undefined)
    
    @scala.inline
    def setReleaseNotesVarargs(value: SchemaLocalizedText*): Self = StObject.set(x, "releaseNotes", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUserFraction(value: Double): Self = StObject.set(x, "userFraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserFractionUndefined: Self = StObject.set(x, "userFraction", js.undefined)
    
    @scala.inline
    def setVersionCodes(value: js.Array[String]): Self = StObject.set(x, "versionCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionCodesUndefined: Self = StObject.set(x, "versionCodes", js.undefined)
    
    @scala.inline
    def setVersionCodesVarargs(value: String*): Self = StObject.set(x, "versionCodes", js.Array(value :_*))
  }
}
