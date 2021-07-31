package typings.googleAppsScript.global.GoogleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Drive {
  
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
  object Access extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Drive.Access & Double] = js.native
    
    /* 0 */ val ANYONE: typings.googleAppsScript.GoogleAppsScript.Drive.Access.ANYONE & Double = js.native
    
    /* 1 */ val ANYONE_WITH_LINK: typings.googleAppsScript.GoogleAppsScript.Drive.Access.ANYONE_WITH_LINK & Double = js.native
    
    /* 2 */ val DOMAIN: typings.googleAppsScript.GoogleAppsScript.Drive.Access.DOMAIN & Double = js.native
    
    /* 3 */ val DOMAIN_WITH_LINK: typings.googleAppsScript.GoogleAppsScript.Drive.Access.DOMAIN_WITH_LINK & Double = js.native
    
    /* 4 */ val PRIVATE: typings.googleAppsScript.GoogleAppsScript.Drive.Access.PRIVATE & Double = js.native
  }
  
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
  object Permission extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Drive.Permission & Double] = js.native
    
    /* 2 */ val COMMENT: typings.googleAppsScript.GoogleAppsScript.Drive.Permission.COMMENT & Double = js.native
    
    /* 1 */ val EDIT: typings.googleAppsScript.GoogleAppsScript.Drive.Permission.EDIT & Double = js.native
    
    /* 5 */ val NONE: typings.googleAppsScript.GoogleAppsScript.Drive.Permission.NONE & Double = js.native
    
    /* 4 */ val ORGANIZER: typings.googleAppsScript.GoogleAppsScript.Drive.Permission.ORGANIZER & Double = js.native
    
    /* 3 */ val OWNER: typings.googleAppsScript.GoogleAppsScript.Drive.Permission.OWNER & Double = js.native
    
    /* 0 */ val VIEW: typings.googleAppsScript.GoogleAppsScript.Drive.Permission.VIEW & Double = js.native
  }
}
