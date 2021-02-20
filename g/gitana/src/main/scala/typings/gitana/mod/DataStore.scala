package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "DataStore")
@js.native
class DataStore protected () extends Repository {
  def this(driver: js.Any, `object`: js.Any) = this()
  
  def createRole(roleKey: js.Any, `object`: js.Any): js.Any = js.native
  
  def createTeam(teamKey: js.Any, `object`: js.Any): js.Any = js.native
  
  def listActivities(pagination: js.Any): js.Any = js.native
  
  def listRoles(inherited: js.Any): js.Any = js.native
  
  def listTeams(): js.Any = js.native
  
  def queryActivities(query: js.Any, pagination: js.Any): js.Any = js.native
  
  def readActivity(activityId: js.Any): js.Any = js.native
  
  def readOwnersTeam(): js.Any = js.native
  
  def readRole(roleKeyOrId: js.Any, inherited: js.Any): js.Any = js.native
  
  def readTeam(teamKey: js.Any): js.Any = js.native
}
object DataStore {
  
  /* static member */
  @JSImport("gitana", "DataStore.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "DataStore.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "DataStore.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "DataStore.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "DataStore.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
