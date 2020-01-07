package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A file or directory to install on the device before the test starts.
  */
@js.native
trait Schema$RegularFile extends js.Object {
  /**
    * Required. The source file.
    */
  var content: js.UndefOr[Schema$FileReference] = js.native
  /**
    * Required. Where to put the content on the device. Must be an absolute,
    * whitelisted path. If the file exists, it will be replaced. The following
    * device-side directories and any of their subdirectories are whitelisted:
    * &lt;p&gt;${EXTERNAL_STORAGE}, or /sdcard&lt;/p&gt;
    * &lt;p&gt;${ANDROID_DATA}/local/tmp, or /data/local/tmp&lt;/p&gt;
    * &lt;p&gt;Specifying a path outside of these directory trees is invalid.
    * &lt;p&gt; The paths /sdcard and /data will be made available and treated
    * as implicit path substitutions. E.g. if /sdcard on a particular device
    * does not map to external storage, the system will replace it with the
    * external storage path prefix for that device and copy the file there.
    * &lt;p&gt; It is strongly advised to use the &lt;a href=
    * &quot;http://developer.android.com/reference/android/os/Environment.html&quot;&gt;
    * Environment API&lt;/a&gt; in app and test code to access files on the
    * device in a portable way.
    */
  var devicePath: js.UndefOr[String] = js.native
}

object Schema$RegularFile {
  @scala.inline
  def apply(content: Schema$FileReference = null, devicePath: String = null): Schema$RegularFile = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (devicePath != null) __obj.updateDynamic("devicePath")(devicePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RegularFile]
  }
}

