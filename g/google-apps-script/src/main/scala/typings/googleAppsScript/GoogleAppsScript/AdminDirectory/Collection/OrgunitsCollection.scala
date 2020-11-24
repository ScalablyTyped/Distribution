package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.OrgUnit
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.OrgUnits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgunitsCollection extends js.Object {
  
  // Retrieve organizational unit
  def get(customerId: String, orgUnitPath: js.Array[String]): OrgUnit = js.native
  
  // Add organizational unit
  def insert(resource: OrgUnit, customerId: String): OrgUnit = js.native
  
  // Retrieve all organizational units
  def list(customerId: String): OrgUnits = js.native
  // Retrieve all organizational units
  def list(customerId: String, optionalArgs: js.Object): OrgUnits = js.native
  
  // Update organizational unit. This method supports patch semantics.
  def patch(resource: OrgUnit, customerId: String, orgUnitPath: js.Array[String]): OrgUnit = js.native
  
  // Remove organizational unit
  def remove(customerId: String, orgUnitPath: js.Array[String]): Unit = js.native
  
  // Update organizational unit
  def update(resource: OrgUnit, customerId: String, orgUnitPath: js.Array[String]): OrgUnit = js.native
}
