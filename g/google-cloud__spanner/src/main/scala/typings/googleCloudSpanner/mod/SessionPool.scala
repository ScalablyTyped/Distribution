package typings.googleCloudSpanner.mod

import typings.googleCloudSpanner.sessionPoolMod.SessionPoolOptions
import typings.stackTrace.mod.StackFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/spanner", "SessionPool")
@js.native
open class SessionPool protected ()
  extends typings.googleCloudSpanner.sessionPoolMod.SessionPool {
  /**
    * @constructor
    * @param {Database} database The DB instance.
    * @param {SessionPoolOptions} [options] Configuration options.
    */
  def this(database: typings.googleCloudSpanner.databaseMod.Database) = this()
  def this(database: typings.googleCloudSpanner.databaseMod.Database, options: SessionPoolOptions) = this()
}
/* static members */
object SessionPool {
  
  @JSImport("@google-cloud/spanner", "SessionPool")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Formats stack trace objects into Node-like stack trace.
    *
    * @param {object[]} trace The trace object.
    * @return {string}
    */
  inline def formatTrace(frames: js.Array[StackFrame]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatTrace")(frames.asInstanceOf[js.Any]).asInstanceOf[String]
}
