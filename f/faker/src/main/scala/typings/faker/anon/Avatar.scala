package typings.faker.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Avatar extends js.Object {
  def avatar(): String = js.native
  def color(): String = js.native
  def color(
    baseRed255: js.UndefOr[scala.Nothing],
    baseGreen255: js.UndefOr[scala.Nothing],
    baseBlue255: Double
  ): String = js.native
  def color(baseRed255: js.UndefOr[scala.Nothing], baseGreen255: Double): String = js.native
  def color(baseRed255: js.UndefOr[scala.Nothing], baseGreen255: Double, baseBlue255: Double): String = js.native
  def color(baseRed255: Double): String = js.native
  def color(baseRed255: Double, baseGreen255: js.UndefOr[scala.Nothing], baseBlue255: Double): String = js.native
  def color(baseRed255: Double, baseGreen255: Double): String = js.native
  def color(baseRed255: Double, baseGreen255: Double, baseBlue255: Double): String = js.native
  def domainName(): String = js.native
  def domainSuffix(): String = js.native
  def domainWord(): String = js.native
  def email(): String = js.native
  def email(firstName: js.UndefOr[scala.Nothing], lastName: js.UndefOr[scala.Nothing], provider: String): String = js.native
  def email(firstName: js.UndefOr[scala.Nothing], lastName: String): String = js.native
  def email(firstName: js.UndefOr[scala.Nothing], lastName: String, provider: String): String = js.native
  def email(firstName: String): String = js.native
  def email(firstName: String, lastName: js.UndefOr[scala.Nothing], provider: String): String = js.native
  def email(firstName: String, lastName: String): String = js.native
  def email(firstName: String, lastName: String, provider: String): String = js.native
  def exampleEmail(): String = js.native
  def exampleEmail(firstName: js.UndefOr[scala.Nothing], lastName: String): String = js.native
  def exampleEmail(firstName: String): String = js.native
  def exampleEmail(firstName: String, lastName: String): String = js.native
  def ip(): String = js.native
  def ipv6(): String = js.native
  def mac(): String = js.native
  def password(): String = js.native
  def password(
    len: js.UndefOr[scala.Nothing],
    memorable: js.UndefOr[scala.Nothing],
    pattern: js.UndefOr[scala.Nothing],
    prefix: String
  ): String = js.native
  def password(len: js.UndefOr[scala.Nothing], memorable: js.UndefOr[scala.Nothing], pattern: String): String = js.native
  def password(
    len: js.UndefOr[scala.Nothing],
    memorable: js.UndefOr[scala.Nothing],
    pattern: String,
    prefix: String
  ): String = js.native
  def password(len: js.UndefOr[scala.Nothing], memorable: js.UndefOr[scala.Nothing], pattern: RegExp): String = js.native
  def password(
    len: js.UndefOr[scala.Nothing],
    memorable: js.UndefOr[scala.Nothing],
    pattern: RegExp,
    prefix: String
  ): String = js.native
  def password(len: js.UndefOr[scala.Nothing], memorable: Boolean): String = js.native
  def password(
    len: js.UndefOr[scala.Nothing],
    memorable: Boolean,
    pattern: js.UndefOr[scala.Nothing],
    prefix: String
  ): String = js.native
  def password(len: js.UndefOr[scala.Nothing], memorable: Boolean, pattern: String): String = js.native
  def password(len: js.UndefOr[scala.Nothing], memorable: Boolean, pattern: String, prefix: String): String = js.native
  def password(len: js.UndefOr[scala.Nothing], memorable: Boolean, pattern: RegExp): String = js.native
  def password(len: js.UndefOr[scala.Nothing], memorable: Boolean, pattern: RegExp, prefix: String): String = js.native
  def password(len: Double): String = js.native
  def password(
    len: Double,
    memorable: js.UndefOr[scala.Nothing],
    pattern: js.UndefOr[scala.Nothing],
    prefix: String
  ): String = js.native
  def password(len: Double, memorable: js.UndefOr[scala.Nothing], pattern: String): String = js.native
  def password(len: Double, memorable: js.UndefOr[scala.Nothing], pattern: String, prefix: String): String = js.native
  def password(len: Double, memorable: js.UndefOr[scala.Nothing], pattern: RegExp): String = js.native
  def password(len: Double, memorable: js.UndefOr[scala.Nothing], pattern: RegExp, prefix: String): String = js.native
  def password(len: Double, memorable: Boolean): String = js.native
  def password(len: Double, memorable: Boolean, pattern: js.UndefOr[scala.Nothing], prefix: String): String = js.native
  def password(len: Double, memorable: Boolean, pattern: String): String = js.native
  def password(len: Double, memorable: Boolean, pattern: String, prefix: String): String = js.native
  def password(len: Double, memorable: Boolean, pattern: RegExp): String = js.native
  def password(len: Double, memorable: Boolean, pattern: RegExp, prefix: String): String = js.native
  def protocol(): String = js.native
  def url(): String = js.native
  def userAgent(): String = js.native
  def userName(): String = js.native
  def userName(firstName: js.UndefOr[scala.Nothing], lastName: String): String = js.native
  def userName(firstName: String): String = js.native
  def userName(firstName: String, lastName: String): String = js.native
}

