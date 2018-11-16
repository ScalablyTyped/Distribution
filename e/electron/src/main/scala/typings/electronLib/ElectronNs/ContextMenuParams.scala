package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ContextMenuParams extends js.Object {
  /**
       * These flags indicate whether the renderer believes it is able to perform the
       * corresponding action.
       */
  var editFlags: EditFlags
  /**
       * The character encoding of the frame on which the menu was invoked.
       */
  var frameCharset: java.lang.String
  /**
       * URL of the subframe that the context menu was invoked on.
       */
  var frameURL: java.lang.String
  /**
       * Whether the context menu was invoked on an image which has non-empty contents.
       */
  var hasImageContents: scala.Boolean
  /**
       * If the context menu was invoked on an input field, the type of that field.
       * Possible values are none, plainText, password, other.
       */
  var inputFieldType: java.lang.String
  /**
       * Whether the context is editable.
       */
  var isEditable: scala.Boolean
  /**
       * Text associated with the link. May be an empty string if the contents of the
       * link are an image.
       */
  var linkText: java.lang.String
  /**
       * URL of the link that encloses the node the context menu was invoked on.
       */
  var linkURL: java.lang.String
  /**
       * The flags for the media element the context menu was invoked on.
       */
  var mediaFlags: MediaFlags
  /**
       * Type of the node the context menu was invoked on. Can be none, image, audio,
       * video, canvas, file or plugin.
       */
  var mediaType: electronLib.electronLibStrings.none | electronLib.electronLibStrings.image | electronLib.electronLibStrings.audio | electronLib.electronLibStrings.video | electronLib.electronLibStrings.canvas | electronLib.electronLibStrings.file | electronLib.electronLibStrings.plugin
  /**
       * Input source that invoked the context menu. Can be none, mouse, keyboard, touch
       * or touchMenu.
       */
  var menuSourceType: electronLib.electronLibStrings.none | electronLib.electronLibStrings.mouse | electronLib.electronLibStrings.keyboard | electronLib.electronLibStrings.touch | electronLib.electronLibStrings.touchMenu
  /**
       * The misspelled word under the cursor, if any.
       */
  var misspelledWord: java.lang.String
  /**
       * URL of the top level page that the context menu was invoked on.
       */
  var pageURL: java.lang.String
  /**
       * Text of the selection that the context menu was invoked on.
       */
  var selectionText: java.lang.String
  /**
       * Source URL for the element that the context menu was invoked on. Elements with
       * source URLs are images, audio and video.
       */
  var srcURL: java.lang.String
  /**
       * Title or alt text of the selection that the context was invoked on.
       */
  var titleText: java.lang.String
  /**
       * x coordinate.
       */
  var x: scala.Double
  /**
       * y coordinate.
       */
  var y: scala.Double
}

