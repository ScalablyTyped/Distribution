package typings.emailTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // email-templates accepts nodemailer.createTransport options directly
  // too and calls createTransport if given a non-function, thus a lot
  // of different types accepted for transport
  type NodeMailerTransportOptions = typings.nodemailer.mailerMod.^  | typings.nodemailer.smtpPoolMod.^  | typings.nodemailer.smtpPoolMod.Options | typings.nodemailer.sendmailTransportMod.^  | typings.nodemailer.sendmailTransportMod.Options | typings.nodemailer.streamTransportMod.^  | typings.nodemailer.streamTransportMod.Options | typings.nodemailer.jsonTransportMod.^  | typings.nodemailer.jsonTransportMod.Options | typings.nodemailer.sesTransportMod.^  | typings.nodemailer.sesTransportMod.Options | typings.nodemailer.smtpTransportMod.^  | typings.nodemailer.smtpTransportMod.Options | java.lang.String
}
