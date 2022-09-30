package typings.firebaseAdmin

import typings.firebaseAdmin.coreMod.App
import typings.firebaseAdmin.functionsApiMod.TaskOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsFunctionsMod {
  
  @JSImport("firebase-admin/lib/functions/functions", "Functions")
  @js.native
  open class Functions () extends StObject {
    
    val app: App = js.native
    
    /* private */ val client: Any = js.native
    
    /**
      * Creates a reference to a {@link TaskQueue} for a given function name.
      * The function name can be either:
      *
      * 1) A fully qualified function resource name:
      *     `projects/{project}/locations/{location}/functions/{functionName}`
      *
      * 2) A partial resource name with location and function name, in which case
      *     the runtime project ID is used:
      *     `locations/{location}/functions/{functionName}`
      *
      * 3) A partial function name, in which case the runtime project ID and the default location,
      *     `us-central1`, is used:
      *     `{functionName}`
      *
      * @param functionName - The name of the function.
      * @param extensionId - Optional Firebase extension ID.
      * @returns A promise that fulfills with a `TaskQueue`.
      */
    def taskQueue[Args](functionName: String): TaskQueue[Args] = js.native
    def taskQueue[Args](functionName: String, extensionId: String): TaskQueue[Args] = js.native
  }
  
  @JSImport("firebase-admin/lib/functions/functions", "TaskQueue")
  @js.native
  open class TaskQueue[Args] () extends StObject {
    
    /* private */ val client: Any = js.native
    
    /**
      * Creates a task and adds it to the queue. Tasks cannot be updated after creation.
      * This action requires `cloudtasks.tasks.create` IAM permission on the service account.
      *
      * @param data - The data payload of the task.
      * @param opts - Optional options when enqueuing a new task.
      * @returns A promise that resolves when the task has successfully been added to the queue.
      */
    def enqueue(data: Args): js.Promise[Unit] = js.native
    def enqueue(data: Args, opts: TaskOptions): js.Promise[Unit] = js.native
    
    /* private */ val extensionId: Any = js.native
    
    /* private */ val functionName: Any = js.native
  }
}
