package typings.googleCloudSpanner.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/spanner", "Session")
@js.native
open class Session protected ()
  extends typings.googleCloudSpanner.sessionMod.Session {
  def this(database: typings.googleCloudSpanner.databaseMod.Database) = this()
  def this(database: typings.googleCloudSpanner.databaseMod.Database, name: String) = this()
}
/* static members */
object Session {
  
  @JSImport("@google-cloud/spanner", "Session")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Format the session name to include the parent database's name.
    *
    * @private
    *
    * @param {string} databaseName The parent database's name.
    * @param {string} name The instance name.
    * @returns {string}
    *
    * @example
    * ```
    * Session.formatName_('my-database', 'my-session');
    * // 'projects/grape-spaceship-123/instances/my-instance/' +
    * // 'databases/my-database/sessions/my-session'
    * ```
    */
  inline def formatName_(databaseName: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(databaseName.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
}
