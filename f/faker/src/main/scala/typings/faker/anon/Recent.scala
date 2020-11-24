package typings.faker.anon

import typings.faker.fakerStrings.abbr
import typings.faker.fakerStrings.unix
import typings.faker.fakerStrings.wide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recent extends js.Object {
  
  def recent(): Double = js.native
  @JSName("recent")
  def recent_abbr(outputType: abbr): String = js.native
  @JSName("recent")
  def recent_unix(outputType: unix): Double = js.native
  @JSName("recent")
  def recent_wide(outputType: wide): String = js.native
}
