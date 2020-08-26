package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofsidebarAction extends js.Object {
  /** Closes the extension sidebar in the active window if the sidebar belongs to the extension. */
  def close(): js.Promise[Unit] = js.native
  /** Gets the url to the html document set as the panel for this sidebar action. */
  def getPanel(details: WindowId): js.Promise[String] = js.native
  /** Gets the title of the sidebar action. */
  def getTitle(details: WindowId): js.Promise[String] = js.native
  /** Checks whether the sidebar action is open. */
  def isOpen(details: `2`): js.Promise[Boolean] = js.native
  /** Opens the extension sidebar in the active window. */
  def open(): js.Promise[Unit] = js.native
  /**
    * Sets the icon for the sidebar action. The icon can be specified either as the path to an image file or as the
    * pixel data from a canvas element, or as dictionary of either one of those. Either the **path** or the
    * **imageData** property must be specified.
    */
  def setIcon(details: ImageDataPath): js.Promise[Unit] = js.native
  /**
    * Sets the url to the html document to be opened in the sidebar when the user clicks on the sidebar action's icon.
    */
  def setPanel(details: Panel): js.Promise[Unit] = js.native
  /* sidebarAction functions */
  /** Sets the title of the sidebar action. This shows up in the tooltip. */
  def setTitle(details: TabId): js.Promise[Unit] = js.native
  /** Toggles the extension sidebar in the active window. */
  def toggle(): js.Promise[Unit] = js.native
}

object TypeofsidebarAction {
  @scala.inline
  def apply(
    close: () => js.Promise[Unit],
    getPanel: WindowId => js.Promise[String],
    getTitle: WindowId => js.Promise[String],
    isOpen: `2` => js.Promise[Boolean],
    open: () => js.Promise[Unit],
    setIcon: ImageDataPath => js.Promise[Unit],
    setPanel: Panel => js.Promise[Unit],
    setTitle: TabId => js.Promise[Unit],
    toggle: () => js.Promise[Unit]
  ): TypeofsidebarAction = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getPanel = js.Any.fromFunction1(getPanel), getTitle = js.Any.fromFunction1(getTitle), isOpen = js.Any.fromFunction1(isOpen), open = js.Any.fromFunction0(open), setIcon = js.Any.fromFunction1(setIcon), setPanel = js.Any.fromFunction1(setPanel), setTitle = js.Any.fromFunction1(setTitle), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[TypeofsidebarAction]
  }
  @scala.inline
  implicit class TypeofsidebarActionOps[Self <: TypeofsidebarAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClose(value: () => js.Promise[Unit]): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPanel(value: WindowId => js.Promise[String]): Self = this.set("getPanel", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTitle(value: WindowId => js.Promise[String]): Self = this.set("getTitle", js.Any.fromFunction1(value))
    @scala.inline
    def setIsOpen(value: `2` => js.Promise[Boolean]): Self = this.set("isOpen", js.Any.fromFunction1(value))
    @scala.inline
    def setOpen(value: () => js.Promise[Unit]): Self = this.set("open", js.Any.fromFunction0(value))
    @scala.inline
    def setSetIcon(value: ImageDataPath => js.Promise[Unit]): Self = this.set("setIcon", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPanel(value: Panel => js.Promise[Unit]): Self = this.set("setPanel", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTitle(value: TabId => js.Promise[Unit]): Self = this.set("setTitle", js.Any.fromFunction1(value))
    @scala.inline
    def setToggle(value: () => js.Promise[Unit]): Self = this.set("toggle", js.Any.fromFunction0(value))
  }
  
}

