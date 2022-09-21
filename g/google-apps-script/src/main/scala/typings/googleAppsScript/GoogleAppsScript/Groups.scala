package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Base.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Groups {
  
  @js.native
  sealed trait Role extends StObject
  /**
    * Possible roles of a user within a group, such as owner or ordinary member. Users subscribed to a
    * group have exactly one role within the context of that group.
    * See also
    *
    * Group.getRole(email)
    */
  @JSGlobal("GoogleAppsScript.Groups.Role")
  @js.native
  object Role extends StObject {
    
    @js.native
    sealed trait INVITED
      extends StObject
         with Role
    
    @js.native
    sealed trait MANAGER
      extends StObject
         with Role
    
    @js.native
    sealed trait MEMBER
      extends StObject
         with Role
    
    @js.native
    sealed trait OWNER
      extends StObject
         with Role
    
    @js.native
    sealed trait PENDING
      extends StObject
         with Role
  }
  
  /**
    * A group object whose members and those members' roles within the group can be queried.
    *
    * Here's an example which shows the members of a group. Before running it, replace the email
    * address of the group with that of one on your domain.
    *
    *     function listGroupMembers() {
    *       var group = GroupsApp.getGroupByEmail("example@googlegroups.com");
    *       var str = group.getEmail() + ': ';
    *       var users = group.getUsers();
    *       for (var i = 0; i < users.length; i++) {
    *         var user = users[i];
    *         str = str + user.getEmail() + ", ";
    *       }
    *       Logger.log(str);
    *     }
    */
  @js.native
  trait Group extends StObject {
    
    def getEmail(): String = js.native
    
    def getGroups(): js.Array[Group] = js.native
    
    def getRole(email: String): Role = js.native
    def getRole(user: User): Role = js.native
    
    def getRoles(users: js.Array[User]): js.Array[Role] = js.native
    
    def getUsers(): js.Array[User] = js.native
    
    def hasGroup(email: String): Boolean = js.native
    def hasGroup(group: Group): Boolean = js.native
    
    def hasUser(email: String): Boolean = js.native
    def hasUser(user: User): Boolean = js.native
  }
  
  /**
    * This class provides access to Google Groups information. It can be used to query information such
    * as a group's email address, or the list of groups in which the user is a direct member.
    *
    * Here's an example that shows how many groups the current user is a member of:
    *
    *     var groups = GroupsApp.getGroups();
    *     Logger.log('You belong to ' + groups.length + ' groups.');
    */
  trait GroupsApp extends StObject {
    
    var Role: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Role */ Any
    
    def getGroupByEmail(email: String): Group
    
    def getGroups(): js.Array[Group]
  }
  object GroupsApp {
    
    inline def apply(
      Role: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Role */ Any,
      getGroupByEmail: String => Group,
      getGroups: () => js.Array[Group]
    ): GroupsApp = {
      val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any], getGroupByEmail = js.Any.fromFunction1(getGroupByEmail), getGroups = js.Any.fromFunction0(getGroups))
      __obj.asInstanceOf[GroupsApp]
    }
    
    extension [Self <: GroupsApp](x: Self) {
      
      inline def setGetGroupByEmail(value: String => Group): Self = StObject.set(x, "getGroupByEmail", js.Any.fromFunction1(value))
      
      inline def setGetGroups(value: () => js.Array[Group]): Self = StObject.set(x, "getGroups", js.Any.fromFunction0(value))
      
      inline def setRole(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Role */ Any): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    }
  }
}
