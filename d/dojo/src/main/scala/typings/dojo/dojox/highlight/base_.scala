package typings.dojo.dojox.highlight

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/highlight/_base.html
  *
  * Syntax highlighting with language auto-detection package
  * Syntax highlighting with language auto-detection package.
  * Released under CLA by the Dojo Toolkit, original BSD release
  * available from: http://softwaremaniacs.org/soft/highlight/
  *
  */
@js.native
trait base_ extends js.Object {
  /**
    *
    */
  var constants: js.Object = js.native
  /**
    *
    */
  var languages: String = js.native
  /**
    * A class object to allow for dojoType usage with the highlight engine. This is
    * NOT a Widget in the conventional sense, and does not have any member functions for
    * the instance. This is provided as a convenience. You likely should be calling
    * dojox.highlight.init directly.
    *
    * @param props               OptionalUnused. Pass 'null' or {}. Positional usage to allow dojo.parser to instantiatethis class as other Widgets would be.
    * @param node A String ID or DomNode reference to use as the root node of this instance.
    */
  def Code(props: js.Object, node: String): Unit = js.native
  /**
    * A class object to allow for dojoType usage with the highlight engine. This is
    * NOT a Widget in the conventional sense, and does not have any member functions for
    * the instance. This is provided as a convenience. You likely should be calling
    * dojox.highlight.init directly.
    *
    * @param props               OptionalUnused. Pass 'null' or {}. Positional usage to allow dojo.parser to instantiatethis class as other Widgets would be.
    * @param node A String ID or DomNode reference to use as the root node of this instance.
    */
  def Code(props: js.Object, node: HTMLElement): Unit = js.native
}

