package typings
package ftpdLib.ftpdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FtpServerOptions extends js.Object {
  /**
    * I obviously set this to true when tlsOnly is on -someone needs to update this.
    */
  var allowUnauthorizedTls: js.UndefOr[scala.Boolean] = js.native
  /**
    * If this is set, then filenames are not sorted in responses to the LIST and NLST commands.
    */
  var dontSortFilenames: js.UndefOr[scala.Boolean] = js.native
  /**
    * A function which can be used as the argument of an array's sort method. Used to sort filenames for directory listings.
    * See [https://developer.mozilla.org/en-US/docs/JavaScript/Reference/Global_Objects/Array/sort] for more info.
    */
  var filenameSortFunc: js.UndefOr[js.Function2[/* a */ java.lang.String, /* b */ java.lang.String, scala.Double]] = js.native
  /**
    * A function which is applied to each filename before sorting.
    * If set to false, filenames are unaltered.
    */
  var filenameSortMap: js.UndefOr[(js.Function1[/* a */ java.lang.String, java.lang.String]) | scala.Boolean] = js.native
  /**
    * Integer from 0-4 representing the Log Level to show.
    */
  var logLevel: js.UndefOr[LogLevel] = js.native
  /**
    * The maximum number of concurrent calls to fs.stat which will be made when processing a LIST request. Default 5.
    */
  var maxStatsAtOnce: js.UndefOr[scala.Double] = js.native
  /**
    * If set to true, then LIST and NLST treat the characters ? and * as literals instead of as wildcards.
    */
  var noWildcards: js.UndefOr[scala.Boolean] = js.native
  /**
    * Integer, specifies the upper-bound port (max port) for creating PASV connections
    */
  var pasvPortRangeEnd: js.UndefOr[scala.Double] = js.native
  /**
    * Integer, specifies the lower-bound port (min port) for creating PASV connections
    */
  var pasvPortRangeStart: js.UndefOr[scala.Double] = js.native
  /**
    * If this is set to true, and tlsOptions is also set, then the server will not allow logins over non-secure connections.
    * Default false
    */
  var tlsOnly: js.UndefOr[scala.Boolean] = js.native
  /**
    * If this is set, the server will allow explicit TLS authentication. Value should be a dictionary which is suitable as the options argument of tls.createServer.
    */
  var tlsOptions: js.UndefOr[nodeLib.tlsMod.TlsOptions] = js.native
  /**
    * Determines the maximum file size (in bytes) for which uploads are buffered in memory before being written to disk.
    * Has an effect only if useWriteFile is set to true.
    * If uploadMaxSlurpSize is not set, then there is no limit on buffer size.
    */
  var uploadMaxSlurpSize: js.UndefOr[scala.Double] = js.native
  /**
    * If set to true, then files which the client uploads are slurped using 'readFile'.
    * If false, files are read using readStream.
    */
  var useReadFile: js.UndefOr[scala.Boolean] = js.native
  /**
    * If set to true, then files which the client uploads are buffered in memory and then written to disk using writeFile.
    * If false, files are written using writeStream.
    */
  var useWriteFile: js.UndefOr[scala.Boolean] = js.native
  /**
    * Gets the initial working directory for the user. Called after user is authenticated
    * Typical cases where you would want/need the callback involve retrieving configurations from external datasources and suchlike.
    */
  def getInitialCwd(connection: FtpConnection): scala.Unit | java.lang.String = js.native
  def getInitialCwd(
    connection: FtpConnection,
    callback: js.Function2[/* error */ nodeLib.Error, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit | java.lang.String = js.native
  /**
    * Gets the root directory for the user relative to the CWD. Called after getInitialCwd. The user is not able to escape this directory.
    * Typical cases where you would want/need the callback involve retrieving configurations from external datasources and suchlike.
    */
  def getRoot(connection: FtpConnection): scala.Unit | java.lang.String = js.native
  def getRoot(
    connection: FtpConnection,
    callback: js.Function2[/* error */ nodeLib.Error, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit | java.lang.String = js.native
}

