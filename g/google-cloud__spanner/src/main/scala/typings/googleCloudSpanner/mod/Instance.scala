package typings.googleCloudSpanner.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link Instance} class represents a [Cloud Spanner
  * instance](https://cloud.google.com/spanner/docs/instances).
  *
  * Create an `Instance` object to interact with a Cloud Spanner instance.
  *
  * @class
  *
  * @param {Spanner} spanner {@link Spanner} instance.
  * @param {string} name Name of the instance.
  *
  * @example
  * ```
  * const {Spanner} = require('@google-cloud/spanner');
  * const spanner = new Spanner();
  * const instance = spanner.instance('my-instance');
  * ```
  */
@JSImport("@google-cloud/spanner", "Instance")
@js.native
open class Instance protected ()
  extends typings.googleCloudSpanner.buildSrcInstanceMod.Instance {
  def this(spanner: Spanner, name: String) = this()
}
object Instance {
  
  @JSImport("@google-cloud/spanner", "Instance")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Format the instance name to include the project ID.
    *
    * @private
    *
    * @param {string} projectId The project ID.
    * @param {string} name The instance name.
    * @returns {string}
    *
    * @example
    * ```
    * Instance.formatName_('grape-spaceship-123', 'my-instance');
    * // 'projects/grape-spaceship-123/instances/my-instance'
    * ```
    */
  /* static member */
  inline def formatName(projectId: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(projectId.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
}
