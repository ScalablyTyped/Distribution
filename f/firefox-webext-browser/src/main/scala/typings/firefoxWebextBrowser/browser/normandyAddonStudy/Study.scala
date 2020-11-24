package typings.firefoxWebextBrowser.browser.normandyAddonStudy

import typings.firefoxWebextBrowser.browser.extensionTypes.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* normandyAddonStudy types */
@js.native
trait Study extends js.Object {
  
  /** The state of the study. */
  var active: Boolean = js.native
  
  /** The ID of the extension installed by the study. */
  var addonId: String = js.native
  
  /** The URL of the XPI that was downloaded and installed by the study. */
  var addonUrl: String = js.native
  
  /** The version of the extension installed by the study. */
  var addonVersion: String = js.native
  
  /** The study branch in which the user is enrolled. */
  var branch: String = js.native
  
  /** The record ID for the extension in Normandy server's database. */
  var extensionApiId: Double = js.native
  
  /** A hash of the extension XPI file. */
  var extensionHash: String = js.native
  
  /** The algorithm used to hash the extension XPI file. */
  var extensionHashAlgorithm: String = js.native
  
  /** The ID of the recipe for the study. */
  var recipeId: Double = js.native
  
  /** A slug to identify the study. */
  var slug: String = js.native
  
  /** The end date for the study. */
  var studyEndDate: Date = js.native
  
  /** The start date for the study. */
  var studyStartDate: Date = js.native
  
  /** The description presented on about:studies. */
  var userFacingDescription: String = js.native
  
  /** The name presented on about:studies. */
  var userFacingName: String = js.native
}
object Study {
  
  @scala.inline
  def apply(
    active: Boolean,
    addonId: String,
    addonUrl: String,
    addonVersion: String,
    branch: String,
    extensionApiId: Double,
    extensionHash: String,
    extensionHashAlgorithm: String,
    recipeId: Double,
    slug: String,
    studyEndDate: Date,
    studyStartDate: Date,
    userFacingDescription: String,
    userFacingName: String
  ): Study = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], addonId = addonId.asInstanceOf[js.Any], addonUrl = addonUrl.asInstanceOf[js.Any], addonVersion = addonVersion.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], extensionApiId = extensionApiId.asInstanceOf[js.Any], extensionHash = extensionHash.asInstanceOf[js.Any], extensionHashAlgorithm = extensionHashAlgorithm.asInstanceOf[js.Any], recipeId = recipeId.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], studyEndDate = studyEndDate.asInstanceOf[js.Any], studyStartDate = studyStartDate.asInstanceOf[js.Any], userFacingDescription = userFacingDescription.asInstanceOf[js.Any], userFacingName = userFacingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Study]
  }
  
  @scala.inline
  implicit class StudyOps[Self <: Study] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddonId(value: String): Self = this.set("addonId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddonUrl(value: String): Self = this.set("addonUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddonVersion(value: String): Self = this.set("addonVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionApiId(value: Double): Self = this.set("extensionApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionHash(value: String): Self = this.set("extensionHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionHashAlgorithm(value: String): Self = this.set("extensionHashAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipeId(value: Double): Self = this.set("recipeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudyEndDate(value: Date): Self = this.set("studyEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudyStartDate(value: Date): Self = this.set("studyStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserFacingDescription(value: String): Self = this.set("userFacingDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserFacingName(value: String): Self = this.set("userFacingName", value.asInstanceOf[js.Any])
  }
}
