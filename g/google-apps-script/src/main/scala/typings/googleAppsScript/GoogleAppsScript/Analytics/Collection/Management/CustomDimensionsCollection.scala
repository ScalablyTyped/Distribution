package typings.googleAppsScript.GoogleAppsScript.Analytics.Collection.Management

import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.CustomDimension
import typings.googleAppsScript.GoogleAppsScript.Analytics.Schema.CustomDimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomDimensionsCollection extends js.Object {
  // Get a custom dimension to which the user has access.
  def get(accountId: String, webPropertyId: String, customDimensionId: String): CustomDimension = js.native
  // Create a new custom dimension.
  def insert(resource: CustomDimension, accountId: String, webPropertyId: String): CustomDimension = js.native
  // Lists custom dimensions to which the user has access.
  def list(accountId: String, webPropertyId: String): CustomDimensions = js.native
  // Lists custom dimensions to which the user has access.
  def list(accountId: String, webPropertyId: String, optionalArgs: js.Object): CustomDimensions = js.native
  // Updates an existing custom dimension. This method supports patch semantics.
  def patch(resource: CustomDimension, accountId: String, webPropertyId: String, customDimensionId: String): CustomDimension = js.native
  // Updates an existing custom dimension. This method supports patch semantics.
  def patch(
    resource: CustomDimension,
    accountId: String,
    webPropertyId: String,
    customDimensionId: String,
    optionalArgs: js.Object
  ): CustomDimension = js.native
  // Updates an existing custom dimension.
  def update(resource: CustomDimension, accountId: String, webPropertyId: String, customDimensionId: String): CustomDimension = js.native
  // Updates an existing custom dimension.
  def update(
    resource: CustomDimension,
    accountId: String,
    webPropertyId: String,
    customDimensionId: String,
    optionalArgs: js.Object
  ): CustomDimension = js.native
}

