package typings.googleCloudSpanner.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link Backup} class represents a Cloud Spanner backup.
  *
  * Create a `Backup` object to interact with or create a Cloud Spanner backup or copy a backup.
  *
  * @class
  *
  * @example
  * ```
  * const {Spanner} = require('@google-cloud/spanner');
  * const spanner = new Spanner();
  * const instance = spanner.instance('my-instance');
  * const backup = instance.backup('my-backup');
  * ```
  *
  * ```
  * * @example
  * const {Spanner} = require('@google-cloud/spanner');
  * const spanner = new Spanner();
  * const instance = spanner.instance('my-instance');
  * const sourceBackup = instance.backup('my-source-backup');
  * const copyBackup = instance.copyBackup('my-copy-backup', 'my-source-backup');
  * ```
  */
@JSImport("@google-cloud/spanner", "Backup")
@js.native
open class Backup protected ()
  extends typings.googleCloudSpanner.buildSrcBackupMod.Backup {
  def this(instance: typings.googleCloudSpanner.buildSrcInstanceMod.Instance, name: String) = this()
  def this(
    instance: typings.googleCloudSpanner.buildSrcInstanceMod.Instance,
    name: String,
    sourceName: String
  ) = this()
}
object Backup {
  
  @JSImport("@google-cloud/spanner", "Backup")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Format the backup name to include the instance name.
    *
    * @private
    *
    * @param {string} instanceName The formatted instance name.
    * @param {string} name The table name.
    * @returns {string}
    *
    * @example
    * ```
    * Backup.formatName_(
    *   'projects/grape-spaceship-123/instances/my-instance',
    *   'my-backup'
    * );
    * // 'projects/grape-spaceship-123/instances/my-instance/backups/my-backup'
    * ```
    */
  /* static member */
  inline def formatName(instanceName: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(instanceName.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
}
