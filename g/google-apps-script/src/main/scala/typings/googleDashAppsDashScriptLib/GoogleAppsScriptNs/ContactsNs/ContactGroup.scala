package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ContactGroup extends js.Object {
  def addContact(contact: Contact): ContactGroup
  def deleteGroup(): scala.Unit
  def getContacts(): js.Array[Contact]
  def getGroupName(): java.lang.String
  def getId(): java.lang.String
  def getName(): java.lang.String
  def isSystemGroup(): scala.Boolean
  def removeContact(contact: Contact): ContactGroup
  def setGroupName(name: java.lang.String): scala.Unit
  def setName(name: java.lang.String): ContactGroup
}

