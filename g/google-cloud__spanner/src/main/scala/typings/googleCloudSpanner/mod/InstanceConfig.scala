package typings.googleCloudSpanner.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link InstanceConfig} class represents a possible configuration for a
  * Cloud Spanner instance.
  *
  * Create an `InstanceConfig` object to interact with a Cloud Spanner instance
  * config.
  *
  * @class
  *
  * @param {Spanner} spanner {@link Spanner} instance.
  * @param {string} name Name of the instance config.
  *
  * @example
  * ```
  * const {Spanner} = require('@google-cloud/spanner');
  * const spanner = new Spanner();
  * const instance = spanner.instanceConfig('my-instance-config');
  * ```
  */
@JSImport("@google-cloud/spanner", "InstanceConfig")
@js.native
open class InstanceConfig protected ()
  extends typings.googleCloudSpanner.buildSrcInstanceConfigMod.InstanceConfig {
  def this(spanner: Spanner, name: String) = this()
}
object InstanceConfig {
  
  @JSImport("@google-cloud/spanner", "InstanceConfig")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Format the instance config name to include the project ID.
    *
    * @private
    *
    * @param {string} projectId The project ID.
    * @param {string} name The instance config name.
    * @returns {string}
    *
    * @example
    * ```
    * InstanceConfig.formatName_('grape-spaceship-123', 'my-instance-config');
    * // 'projects/grape-spaceship-123/instanceConfigs/my-instance-config'
    * ```
    */
  /* static member */
  inline def formatName(projectId: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(projectId.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
}
