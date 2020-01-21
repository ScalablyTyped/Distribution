package typings.googleAppsScript.GoogleAppsScript.XMLService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A formatter for outputting an XML document, with three pre-defined formats that can be further
  * customized.
  *
  *     // Log an XML document with specified formatting options.
  *     var xml = '<root><a><b>Text!</b><b>More text!</b></a></root>';
  *     var document = XmlService.parse(xml);
  *     var output = XmlService.getCompactFormat()
  *         .setLineSeparator('\n')
  *         .setEncoding('UTF-8')
  *         .setIndent('   ')
  *         .format(document);
  *     Logger.log(output);
  */
@js.native
trait Format extends js.Object {
  def format(document: Document): String = js.native
  def format(element: Element): String = js.native
  def setEncoding(encoding: String): Format = js.native
  def setIndent(indent: String): Format = js.native
  def setLineSeparator(separator: String): Format = js.native
  def setOmitDeclaration(omitDeclaration: Boolean): Format = js.native
  def setOmitEncoding(omitEncoding: Boolean): Format = js.native
}

