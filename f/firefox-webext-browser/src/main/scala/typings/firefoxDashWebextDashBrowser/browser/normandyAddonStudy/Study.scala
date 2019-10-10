package typings.firefoxDashWebextDashBrowser.browser.normandyAddonStudy

import typings.firefoxDashWebextDashBrowser.browser.extensionTypes.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* normandyAddonStudy types */
trait Study extends js.Object {
  /** The state of the study. */
  var active: Boolean
  /** The ID of the extension installed by the study. */
  var addonId: String
  /** The URL of the XPI that was downloaded and installed by the study. */
  var addonUrl: String
  /** The version of the extension installed by the study. */
  var addonVersion: String
  /** The study branch in which the user is enrolled. */
  var branch: String
  /** The record ID for the extension in Normandy server's database. */
  var extensionApiId: Double
  /** A hash of the extension XPI file. */
  var extensionHash: String
  /** The algorithm used to hash the extension XPI file. */
  var extensionHashAlgorithm: String
  /** The ID of the recipe for the study. */
  var recipeId: Double
  /** A slug to identify the study. */
  var slug: String
  /** The end date for the study. */
  var studyEndDate: Date
  /** The start date for the study. */
  var studyStartDate: Date
  /** The description presented on about:studies. */
  var userFacingDescription: String
  /** The name presented on about:studies. */
  var userFacingName: String
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
    val __obj = js.Dynamic.literal(active = active, addonId = addonId, addonUrl = addonUrl, addonVersion = addonVersion, branch = branch, extensionApiId = extensionApiId, extensionHash = extensionHash, extensionHashAlgorithm = extensionHashAlgorithm, recipeId = recipeId, slug = slug, studyEndDate = studyEndDate.asInstanceOf[js.Any], studyStartDate = studyStartDate.asInstanceOf[js.Any], userFacingDescription = userFacingDescription, userFacingName = userFacingName)
  
    __obj.asInstanceOf[Study]
  }
}

