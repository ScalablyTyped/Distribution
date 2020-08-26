package typings.formatjsIntlGetcanonicallocales.typesMod

import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.a
import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.b
import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.c
import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.d
import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.e
import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.f
import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.g
import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.h
import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.i
import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.j
import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.k
import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.l
import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.m
import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.n
import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.o
import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.p
import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.q
import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.r
import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.s
import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.v
import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.w
import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.y
import typings.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.z
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OtherExtension extends Extension {
  @JSName("type")
  var type_OtherExtension: a | b | c | d | e | f | g | h | i | j | k | l | m | n | o | p | q | r | s | v | w | y | z = js.native
  var value: String = js.native
}

object OtherExtension {
  @scala.inline
  def apply(
    `type`: a | b | c | d | e | f | g | h | i | j | k | l | m | n | o | p | q | r | s | v | w | y | z,
    value: String
  ): OtherExtension = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherExtension]
  }
  @scala.inline
  implicit class OtherExtensionOps[Self <: OtherExtension] (val x: Self) extends AnyVal {
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
    def setType(value: a | b | c | d | e | f | g | h | i | j | k | l | m | n | o | p | q | r | s | v | w | y | z): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

