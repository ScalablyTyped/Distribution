package typings.googleAppsScript.GoogleAppsScript.Drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Access extends js.Object

/**
  * An enum representing classes of users who can access a file or folder, besides any individual
  * users who have been explicitly given access. These properties can be accessed from DriveApp.Access.
  *
  *     // Creates a folder that anyone on the Internet can read from and write to. (Domain
  *     // administrators can prohibit this setting for users of a G Suite domain.)
  *     var folder = DriveApp.createFolder('Shared Folder');
  *     folder.setSharing(DriveApp.Access.ANYONE, DriveApp.Permission.EDIT);
  */
@JSGlobal("GoogleAppsScript.Drive.Access")
@js.native
object Access extends js.Object {
  @js.native
  sealed trait ANYONE extends Access
  
  @js.native
  sealed trait ANYONE_WITH_LINK extends Access
  
  @js.native
  sealed trait DOMAIN extends Access
  
  @js.native
  sealed trait DOMAIN_WITH_LINK extends Access
  
  @js.native
  sealed trait PRIVATE extends Access
  
}

