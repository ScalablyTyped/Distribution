package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "DataStore")
@js.native
open class DataStore protected () extends Repository {
  def this(driver: Any, `object`: Any) = this()
  
  def createRole(roleKey: Any, `object`: Any): Any = js.native
  
  def createTeam(teamKey: Any, `object`: Any): Any = js.native
  
  def listActivities(pagination: Any): Any = js.native
  
  def listRoles(inherited: Any): Any = js.native
  
  def listTeams(): Any = js.native
  
  def queryActivities(query: Any, pagination: Any): Any = js.native
  
  def readActivity(activityId: Any): Any = js.native
  
  def readOwnersTeam(): Any = js.native
  
  def readRole(roleKeyOrId: Any, inherited: Any): Any = js.native
  
  def readTeam(teamKey: Any): Any = js.native
}
object DataStore {
  
  @JSImport("gitana", "DataStore")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(_instance: Any, _static: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")((scala.List(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  /* static member */
  inline def forEach(`object`: Any, block: Any, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def implement(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  /* static member */
  inline def toString_(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[Any]
  
  /* static member */
  inline def valueOf_(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
