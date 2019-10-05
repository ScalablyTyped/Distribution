package typings.evernote.evernoteMod.Evernote

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An application name must match this regex.    An application
  * name is the key portion of an entry in an applicationData
  * map as found in entities such as Resources and Notes.
  * Note that even if both the name and value regexes match,
  * it is still necessary to check the sum of the lengths
  * against EDAM_APPLICATIONDATA_ENTRY_LEN_MAX.
  */
@JSImport("evernote", "Evernote.EDAM_APPLICATIONDATA_NAME_REGEX")
@js.native
object EDAM_APPLICATIONDATA_NAME_REGEX extends TopLevel[String]

