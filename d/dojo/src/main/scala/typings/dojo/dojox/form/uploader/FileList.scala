package typings.dojo.dojox.form.uploader

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.headerFilename
import typings.dojo.dojoStrings.headerFilesize
import typings.dojo.dojoStrings.headerIndex
import typings.dojo.dojoStrings.headerType
import typings.dojo.dojoStrings.rowAmt
import typings.dojo.dojoStrings.uploaderId
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/form/uploader/FileList.html
  *
  * A simple widget that provides a list of the files currently selected by
  * dojox/form/Uploader
  * There is a required CSS file: resources/UploaderFileList.css.
  * This is a very simple widget, and not beautifully styled. It is here mainly for test
  * cases, but could very easily be used, extended, modified, or copied.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.form.uploader.FileList")
@js.native
class FileList () extends _Base {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * The label for the file name column.
    *
    */
  var headerFilename: String = js.native
  /**
    * The label for the file size column.
    *
    */
  var headerFilesize: String = js.native
  /**
    * The label for the index column.
    *
    */
  var headerIndex: String = js.native
  /**
    * The label for the file type column.
    *
    */
  var headerType: String = js.native
  /**
    *
    */
  var rowAmt: Double = js.native
  /**
    * The dojox.form.Uploader to connect to. Use either this property of unploaderId. This
    * property is populated if uploaderId is used.
    *
    */
  var uploader: js.Object = js.native
  /**
    * The id of the dojox.form.Uploader to connect to.
    *
    */
  var uploaderId: String = js.native
  @JSName("get")
  def get_headerFilename(property: headerFilename): String = js.native
  @JSName("get")
  def get_headerFilesize(property: headerFilesize): String = js.native
  @JSName("get")
  def get_headerIndex(property: headerIndex): String = js.native
  @JSName("get")
  def get_headerType(property: headerType): String = js.native
  @JSName("get")
  def get_rowAmt(property: rowAmt): Double = js.native
  @JSName("get")
  def get_uploader(property: typings.dojo.dojoStrings.uploader): js.Object = js.native
  @JSName("get")
  def get_uploaderId(property: uploaderId): String = js.native
  /**
    *
    * @param animate
    */
  def hideProgress(animate: Boolean): Unit = js.native
  /**
    * Clears all rows of items. Happens automatically if Uploader is reset, but you
    * could call this directly.
    *
    */
  def reset(): Unit = js.native
  /**
    * Connects to the Uploader based on the uploader or the uploaderId properties.
    *
    */
  def setUploader(): Unit = js.native
  @JSName("set")
  def set_headerFilename(property: headerFilename, value: String): Unit = js.native
  @JSName("set")
  def set_headerFilesize(property: headerFilesize, value: String): Unit = js.native
  @JSName("set")
  def set_headerIndex(property: headerIndex, value: String): Unit = js.native
  @JSName("set")
  def set_headerType(property: headerType, value: String): Unit = js.native
  @JSName("set")
  def set_rowAmt(property: rowAmt, value: Double): Unit = js.native
  @JSName("set")
  def set_uploader(property: typings.dojo.dojoStrings.uploader, value: js.Object): Unit = js.native
  @JSName("set")
  def set_uploaderId(property: uploaderId, value: String): Unit = js.native
  /**
    *
    * @param animate
    */
  def showProgress(animate: Boolean): Unit = js.native
  @JSName("watch")
  def watch_headerFilename(
    property: headerFilename,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_headerFilesize(
    property: headerFilesize,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_headerIndex(
    property: headerIndex,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_headerType(
    property: headerType,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_rowAmt(
    property: rowAmt,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_uploader(
    property: typings.dojo.dojoStrings.uploader,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_uploaderId(
    property: uploaderId,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

