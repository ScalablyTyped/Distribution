package typings.emailDashTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object emailDashTemplatesMod {
  import typings.nodemailer.libSmtpDashPoolMod.Options

  // email-templates accepts nodemailer.createTransport options directly
  // too and calls createTransport if given a non-function, thus a lot
  // of different types accepted for transport
  type NodeMailerTransportOptions = typings.nodemailer.libMailerMod.^  | typings.nodemailer.libSmtpDashPoolMod.^  | Options | typings.nodemailer.libSendmailDashTransportMod.^  | typings.nodemailer.libSendmailDashTransportMod.Options | typings.nodemailer.libStreamDashTransportMod.^  | typings.nodemailer.libStreamDashTransportMod.Options | typings.nodemailer.libJsonDashTransportMod.^  | typings.nodemailer.libJsonDashTransportMod.Options | typings.nodemailer.libSesDashTransportMod.^  | typings.nodemailer.libSesDashTransportMod.Options | typings.nodemailer.libSmtpDashTransportMod.^  | typings.nodemailer.libSmtpDashTransportMod.Options | String
}
