package typings.firefoxWebextBrowser.browser

import typings.firefoxWebextBrowser.browser.extensionTypes.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Normandy Study API
  *
  * Permissions: `normandyAddonStudy`
  */
object normandyAddonStudy {
  
  /* normandyAddonStudy types */
  @js.native
  trait Study extends StObject {
    
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
    implicit class StudyMutableBuilder[Self <: Study] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddonId(value: String): Self = StObject.set(x, "addonId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddonUrl(value: String): Self = StObject.set(x, "addonUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddonVersion(value: String): Self = StObject.set(x, "addonVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionApiId(value: Double): Self = StObject.set(x, "extensionApiId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionHash(value: String): Self = StObject.set(x, "extensionHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionHashAlgorithm(value: String): Self = StObject.set(x, "extensionHashAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipeId(value: Double): Self = StObject.set(x, "recipeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStudyEndDate(value: Date): Self = StObject.set(x, "studyEndDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStudyStartDate(value: Date): Self = StObject.set(x, "studyStartDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserFacingDescription(value: String): Self = StObject.set(x, "userFacingDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserFacingName(value: String): Self = StObject.set(x, "userFacingName", value.asInstanceOf[js.Any])
    }
  }
}
