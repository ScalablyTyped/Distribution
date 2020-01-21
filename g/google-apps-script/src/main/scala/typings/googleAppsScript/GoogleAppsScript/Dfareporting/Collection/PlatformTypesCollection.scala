package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.PlatformType
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.PlatformTypesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformTypesCollection extends js.Object {
  // Gets one platform type by ID.
  def get(profileId: String, id: String): PlatformType
  // Retrieves a list of platform types.
  def list(profileId: String): PlatformTypesListResponse
}

object PlatformTypesCollection {
  @scala.inline
  def apply(get: (String, String) => PlatformType, list: String => PlatformTypesListResponse): PlatformTypesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[PlatformTypesCollection]
  }
}

