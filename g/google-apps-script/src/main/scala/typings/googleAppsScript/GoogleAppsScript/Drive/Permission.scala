package typings.googleAppsScript.GoogleAppsScript.Drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Permission extends js.Object
/**
  * An enum representing the permissions granted to users who can access a file or folder, besides
  * any individual users who have been explicitly given access. These properties can be accessed from
  * DriveApp.Permission.
  *
  *     // Creates a folder that anyone on the Internet can read from and write to. (Domain
  *     // administrators can prohibit this setting for G Suite users.)
  *     var folder = DriveApp.createFolder('Shared Folder');
  *     folder.setSharing(DriveApp.Access.ANYONE, DriveApp.Permission.EDIT);
  */
@JSGlobal("GoogleAppsScript.Drive.Permission")
@js.native
object Permission extends js.Object {
  
  @js.native
  sealed trait COMMENT extends Permission
  
  @js.native
  sealed trait EDIT extends Permission
  
  @js.native
  sealed trait NONE extends Permission
  
  @js.native
  sealed trait ORGANIZER extends Permission
  
  @js.native
  sealed trait OWNER extends Permission
  
  @js.native
  sealed trait VIEW extends Permission
}
