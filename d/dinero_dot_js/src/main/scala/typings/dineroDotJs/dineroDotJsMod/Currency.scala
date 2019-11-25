package typings.dineroDotJs.dineroDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ISO 4217 CURRENCY CODES as specified in the documentation
  * Taken from https://www.iso.org/iso-4217-currency-codes.html
  * sorted and parsed
  */
/* Rewritten from type alias, can be one of: 
  - typings.dineroDotJs.dineroDotJsStrings.AED
  - typings.dineroDotJs.dineroDotJsStrings.AFN
  - typings.dineroDotJs.dineroDotJsStrings.ALL
  - typings.dineroDotJs.dineroDotJsStrings.AMD
  - typings.dineroDotJs.dineroDotJsStrings.ANG
  - typings.dineroDotJs.dineroDotJsStrings.AOA
  - typings.dineroDotJs.dineroDotJsStrings.ARS
  - typings.dineroDotJs.dineroDotJsStrings.AUD
  - typings.dineroDotJs.dineroDotJsStrings.AWG
  - typings.dineroDotJs.dineroDotJsStrings.AZN
  - typings.dineroDotJs.dineroDotJsStrings.BAM
  - typings.dineroDotJs.dineroDotJsStrings.BBD
  - typings.dineroDotJs.dineroDotJsStrings.BDT
  - typings.dineroDotJs.dineroDotJsStrings.BGN
  - typings.dineroDotJs.dineroDotJsStrings.BHD
  - typings.dineroDotJs.dineroDotJsStrings.BIF
  - typings.dineroDotJs.dineroDotJsStrings.BMD
  - typings.dineroDotJs.dineroDotJsStrings.BND
  - typings.dineroDotJs.dineroDotJsStrings.BOB
  - typings.dineroDotJs.dineroDotJsStrings.BOV
  - typings.dineroDotJs.dineroDotJsStrings.BRL
  - typings.dineroDotJs.dineroDotJsStrings.BSD
  - typings.dineroDotJs.dineroDotJsStrings.BTN
  - typings.dineroDotJs.dineroDotJsStrings.BWP
  - typings.dineroDotJs.dineroDotJsStrings.BYN
  - typings.dineroDotJs.dineroDotJsStrings.BZD
  - typings.dineroDotJs.dineroDotJsStrings.CAD
  - typings.dineroDotJs.dineroDotJsStrings.CDF
  - typings.dineroDotJs.dineroDotJsStrings.CHE
  - typings.dineroDotJs.dineroDotJsStrings.CHF
  - typings.dineroDotJs.dineroDotJsStrings.CHW
  - typings.dineroDotJs.dineroDotJsStrings.CLF
  - typings.dineroDotJs.dineroDotJsStrings.CLP
  - typings.dineroDotJs.dineroDotJsStrings.CNY
  - typings.dineroDotJs.dineroDotJsStrings.COP
  - typings.dineroDotJs.dineroDotJsStrings.COU
  - typings.dineroDotJs.dineroDotJsStrings.CRC
  - typings.dineroDotJs.dineroDotJsStrings.CUC
  - typings.dineroDotJs.dineroDotJsStrings.CUP
  - typings.dineroDotJs.dineroDotJsStrings.CVE
  - typings.dineroDotJs.dineroDotJsStrings.CZK
  - typings.dineroDotJs.dineroDotJsStrings.DJF
  - typings.dineroDotJs.dineroDotJsStrings.DKK
  - typings.dineroDotJs.dineroDotJsStrings.DOP
  - typings.dineroDotJs.dineroDotJsStrings.DZD
  - typings.dineroDotJs.dineroDotJsStrings.EGP
  - typings.dineroDotJs.dineroDotJsStrings.ERN
  - typings.dineroDotJs.dineroDotJsStrings.ETB
  - typings.dineroDotJs.dineroDotJsStrings.EUR
  - typings.dineroDotJs.dineroDotJsStrings.FJD
  - typings.dineroDotJs.dineroDotJsStrings.FKP
  - typings.dineroDotJs.dineroDotJsStrings.GBP
  - typings.dineroDotJs.dineroDotJsStrings.GEL
  - typings.dineroDotJs.dineroDotJsStrings.GHS
  - typings.dineroDotJs.dineroDotJsStrings.GIP
  - typings.dineroDotJs.dineroDotJsStrings.GMD
  - typings.dineroDotJs.dineroDotJsStrings.GNF
  - typings.dineroDotJs.dineroDotJsStrings.GTQ
  - typings.dineroDotJs.dineroDotJsStrings.GYD
  - typings.dineroDotJs.dineroDotJsStrings.HKD
  - typings.dineroDotJs.dineroDotJsStrings.HNL
  - typings.dineroDotJs.dineroDotJsStrings.HRK
  - typings.dineroDotJs.dineroDotJsStrings.HTG
  - typings.dineroDotJs.dineroDotJsStrings.HUF
  - typings.dineroDotJs.dineroDotJsStrings.IDR
  - typings.dineroDotJs.dineroDotJsStrings.ILS
  - typings.dineroDotJs.dineroDotJsStrings.INR
  - typings.dineroDotJs.dineroDotJsStrings.IQD
  - typings.dineroDotJs.dineroDotJsStrings.IRR
  - typings.dineroDotJs.dineroDotJsStrings.ISK
  - typings.dineroDotJs.dineroDotJsStrings.JMD
  - typings.dineroDotJs.dineroDotJsStrings.JOD
  - typings.dineroDotJs.dineroDotJsStrings.JPY
  - typings.dineroDotJs.dineroDotJsStrings.KES
  - typings.dineroDotJs.dineroDotJsStrings.KGS
  - typings.dineroDotJs.dineroDotJsStrings.KHR
  - typings.dineroDotJs.dineroDotJsStrings.KMF
  - typings.dineroDotJs.dineroDotJsStrings.KPW
  - typings.dineroDotJs.dineroDotJsStrings.KRW
  - typings.dineroDotJs.dineroDotJsStrings.KWD
  - typings.dineroDotJs.dineroDotJsStrings.KYD
  - typings.dineroDotJs.dineroDotJsStrings.KZT
  - typings.dineroDotJs.dineroDotJsStrings.LAK
  - typings.dineroDotJs.dineroDotJsStrings.LBP
  - typings.dineroDotJs.dineroDotJsStrings.LKR
  - typings.dineroDotJs.dineroDotJsStrings.LRD
  - typings.dineroDotJs.dineroDotJsStrings.LSL
  - typings.dineroDotJs.dineroDotJsStrings.LYD
  - typings.dineroDotJs.dineroDotJsStrings.MAD
  - typings.dineroDotJs.dineroDotJsStrings.MDL
  - typings.dineroDotJs.dineroDotJsStrings.MGA
  - typings.dineroDotJs.dineroDotJsStrings.MKD
  - typings.dineroDotJs.dineroDotJsStrings.MMK
  - typings.dineroDotJs.dineroDotJsStrings.MNT
  - typings.dineroDotJs.dineroDotJsStrings.MOP
  - typings.dineroDotJs.dineroDotJsStrings.MRU
  - typings.dineroDotJs.dineroDotJsStrings.MUR
  - typings.dineroDotJs.dineroDotJsStrings.MVR
  - typings.dineroDotJs.dineroDotJsStrings.MWK
  - typings.dineroDotJs.dineroDotJsStrings.MXN
  - typings.dineroDotJs.dineroDotJsStrings.MXV
  - typings.dineroDotJs.dineroDotJsStrings.MYR
  - typings.dineroDotJs.dineroDotJsStrings.MZN
  - typings.dineroDotJs.dineroDotJsStrings.NAD
  - typings.dineroDotJs.dineroDotJsStrings.NGN
  - typings.dineroDotJs.dineroDotJsStrings.NIO
  - typings.dineroDotJs.dineroDotJsStrings.NOK
  - typings.dineroDotJs.dineroDotJsStrings.NPR
  - typings.dineroDotJs.dineroDotJsStrings.NZD
  - typings.dineroDotJs.dineroDotJsStrings.OMR
  - typings.dineroDotJs.dineroDotJsStrings.PAB
  - typings.dineroDotJs.dineroDotJsStrings.PEN
  - typings.dineroDotJs.dineroDotJsStrings.PGK
  - typings.dineroDotJs.dineroDotJsStrings.PHP
  - typings.dineroDotJs.dineroDotJsStrings.PKR
  - typings.dineroDotJs.dineroDotJsStrings.PLN
  - typings.dineroDotJs.dineroDotJsStrings.PYG
  - typings.dineroDotJs.dineroDotJsStrings.QAR
  - typings.dineroDotJs.dineroDotJsStrings.RON
  - typings.dineroDotJs.dineroDotJsStrings.RSD
  - typings.dineroDotJs.dineroDotJsStrings.RUB
  - typings.dineroDotJs.dineroDotJsStrings.RWF
  - typings.dineroDotJs.dineroDotJsStrings.SAR
  - typings.dineroDotJs.dineroDotJsStrings.SBD
  - typings.dineroDotJs.dineroDotJsStrings.SCR
  - typings.dineroDotJs.dineroDotJsStrings.SDG
  - typings.dineroDotJs.dineroDotJsStrings.SEK
  - typings.dineroDotJs.dineroDotJsStrings.SGD
  - typings.dineroDotJs.dineroDotJsStrings.SHP
  - typings.dineroDotJs.dineroDotJsStrings.SLL
  - typings.dineroDotJs.dineroDotJsStrings.SOS
  - typings.dineroDotJs.dineroDotJsStrings.SRD
  - typings.dineroDotJs.dineroDotJsStrings.SSP
  - typings.dineroDotJs.dineroDotJsStrings.STN
  - typings.dineroDotJs.dineroDotJsStrings.SVC
  - typings.dineroDotJs.dineroDotJsStrings.SYP
  - typings.dineroDotJs.dineroDotJsStrings.SZL
  - typings.dineroDotJs.dineroDotJsStrings.THB
  - typings.dineroDotJs.dineroDotJsStrings.TJS
  - typings.dineroDotJs.dineroDotJsStrings.TMT
  - typings.dineroDotJs.dineroDotJsStrings.TND
  - typings.dineroDotJs.dineroDotJsStrings.TOP
  - typings.dineroDotJs.dineroDotJsStrings.TRY
  - typings.dineroDotJs.dineroDotJsStrings.TTD
  - typings.dineroDotJs.dineroDotJsStrings.TWD
  - typings.dineroDotJs.dineroDotJsStrings.TZS
  - typings.dineroDotJs.dineroDotJsStrings.UAH
  - typings.dineroDotJs.dineroDotJsStrings.UGX
  - typings.dineroDotJs.dineroDotJsStrings.USD
  - typings.dineroDotJs.dineroDotJsStrings.USN
  - typings.dineroDotJs.dineroDotJsStrings.UYI
  - typings.dineroDotJs.dineroDotJsStrings.UYU
  - typings.dineroDotJs.dineroDotJsStrings.UYW
  - typings.dineroDotJs.dineroDotJsStrings.UZS
  - typings.dineroDotJs.dineroDotJsStrings.VES
  - typings.dineroDotJs.dineroDotJsStrings.VND
  - typings.dineroDotJs.dineroDotJsStrings.VUV
  - typings.dineroDotJs.dineroDotJsStrings.WST
  - typings.dineroDotJs.dineroDotJsStrings.XAF
  - typings.dineroDotJs.dineroDotJsStrings.XAG
  - typings.dineroDotJs.dineroDotJsStrings.XAU
  - typings.dineroDotJs.dineroDotJsStrings.XBA
  - typings.dineroDotJs.dineroDotJsStrings.XBB
  - typings.dineroDotJs.dineroDotJsStrings.XBC
  - typings.dineroDotJs.dineroDotJsStrings.XBD
  - typings.dineroDotJs.dineroDotJsStrings.XCD
  - typings.dineroDotJs.dineroDotJsStrings.XDR
  - typings.dineroDotJs.dineroDotJsStrings.XOF
  - typings.dineroDotJs.dineroDotJsStrings.XPD
  - typings.dineroDotJs.dineroDotJsStrings.XPF
  - typings.dineroDotJs.dineroDotJsStrings.XPT
  - typings.dineroDotJs.dineroDotJsStrings.XSU
  - typings.dineroDotJs.dineroDotJsStrings.XTS
  - typings.dineroDotJs.dineroDotJsStrings.XUA
  - typings.dineroDotJs.dineroDotJsStrings.XXX
  - typings.dineroDotJs.dineroDotJsStrings.YER
  - typings.dineroDotJs.dineroDotJsStrings.ZAR
  - typings.dineroDotJs.dineroDotJsStrings.ZMW
  - typings.dineroDotJs.dineroDotJsStrings.ZWL
*/
trait Currency extends js.Object

object Currency {
  @scala.inline
  def AED: typings.dineroDotJs.dineroDotJsStrings.AED = this.cast("AED")
  @scala.inline
  def AFN: typings.dineroDotJs.dineroDotJsStrings.AFN = this.cast("AFN")
  @scala.inline
  def ALL: typings.dineroDotJs.dineroDotJsStrings.ALL = this.cast("ALL")
  @scala.inline
  def AMD: typings.dineroDotJs.dineroDotJsStrings.AMD = this.cast("AMD")
  @scala.inline
  def ANG: typings.dineroDotJs.dineroDotJsStrings.ANG = this.cast("ANG")
  @scala.inline
  def AOA: typings.dineroDotJs.dineroDotJsStrings.AOA = this.cast("AOA")
  @scala.inline
  def ARS: typings.dineroDotJs.dineroDotJsStrings.ARS = this.cast("ARS")
  @scala.inline
  def AUD: typings.dineroDotJs.dineroDotJsStrings.AUD = this.cast("AUD")
  @scala.inline
  def AWG: typings.dineroDotJs.dineroDotJsStrings.AWG = this.cast("AWG")
  @scala.inline
  def AZN: typings.dineroDotJs.dineroDotJsStrings.AZN = this.cast("AZN")
  @scala.inline
  def BAM: typings.dineroDotJs.dineroDotJsStrings.BAM = this.cast("BAM")
  @scala.inline
  def BBD: typings.dineroDotJs.dineroDotJsStrings.BBD = this.cast("BBD")
  @scala.inline
  def BDT: typings.dineroDotJs.dineroDotJsStrings.BDT = this.cast("BDT")
  @scala.inline
  def BGN: typings.dineroDotJs.dineroDotJsStrings.BGN = this.cast("BGN")
  @scala.inline
  def BHD: typings.dineroDotJs.dineroDotJsStrings.BHD = this.cast("BHD")
  @scala.inline
  def BIF: typings.dineroDotJs.dineroDotJsStrings.BIF = this.cast("BIF")
  @scala.inline
  def BMD: typings.dineroDotJs.dineroDotJsStrings.BMD = this.cast("BMD")
  @scala.inline
  def BND: typings.dineroDotJs.dineroDotJsStrings.BND = this.cast("BND")
  @scala.inline
  def BOB: typings.dineroDotJs.dineroDotJsStrings.BOB = this.cast("BOB")
  @scala.inline
  def BOV: typings.dineroDotJs.dineroDotJsStrings.BOV = this.cast("BOV")
  @scala.inline
  def BRL: typings.dineroDotJs.dineroDotJsStrings.BRL = this.cast("BRL")
  @scala.inline
  def BSD: typings.dineroDotJs.dineroDotJsStrings.BSD = this.cast("BSD")
  @scala.inline
  def BTN: typings.dineroDotJs.dineroDotJsStrings.BTN = this.cast("BTN")
  @scala.inline
  def BWP: typings.dineroDotJs.dineroDotJsStrings.BWP = this.cast("BWP")
  @scala.inline
  def BYN: typings.dineroDotJs.dineroDotJsStrings.BYN = this.cast("BYN")
  @scala.inline
  def BZD: typings.dineroDotJs.dineroDotJsStrings.BZD = this.cast("BZD")
  @scala.inline
  def CAD: typings.dineroDotJs.dineroDotJsStrings.CAD = this.cast("CAD")
  @scala.inline
  def CDF: typings.dineroDotJs.dineroDotJsStrings.CDF = this.cast("CDF")
  @scala.inline
  def CHE: typings.dineroDotJs.dineroDotJsStrings.CHE = this.cast("CHE")
  @scala.inline
  def CHF: typings.dineroDotJs.dineroDotJsStrings.CHF = this.cast("CHF")
  @scala.inline
  def CHW: typings.dineroDotJs.dineroDotJsStrings.CHW = this.cast("CHW")
  @scala.inline
  def CLF: typings.dineroDotJs.dineroDotJsStrings.CLF = this.cast("CLF")
  @scala.inline
  def CLP: typings.dineroDotJs.dineroDotJsStrings.CLP = this.cast("CLP")
  @scala.inline
  def CNY: typings.dineroDotJs.dineroDotJsStrings.CNY = this.cast("CNY")
  @scala.inline
  def COP: typings.dineroDotJs.dineroDotJsStrings.COP = this.cast("COP")
  @scala.inline
  def COU: typings.dineroDotJs.dineroDotJsStrings.COU = this.cast("COU")
  @scala.inline
  def CRC: typings.dineroDotJs.dineroDotJsStrings.CRC = this.cast("CRC")
  @scala.inline
  def CUC: typings.dineroDotJs.dineroDotJsStrings.CUC = this.cast("CUC")
  @scala.inline
  def CUP: typings.dineroDotJs.dineroDotJsStrings.CUP = this.cast("CUP")
  @scala.inline
  def CVE: typings.dineroDotJs.dineroDotJsStrings.CVE = this.cast("CVE")
  @scala.inline
  def CZK: typings.dineroDotJs.dineroDotJsStrings.CZK = this.cast("CZK")
  @scala.inline
  def DJF: typings.dineroDotJs.dineroDotJsStrings.DJF = this.cast("DJF")
  @scala.inline
  def DKK: typings.dineroDotJs.dineroDotJsStrings.DKK = this.cast("DKK")
  @scala.inline
  def DOP: typings.dineroDotJs.dineroDotJsStrings.DOP = this.cast("DOP")
  @scala.inline
  def DZD: typings.dineroDotJs.dineroDotJsStrings.DZD = this.cast("DZD")
  @scala.inline
  def EGP: typings.dineroDotJs.dineroDotJsStrings.EGP = this.cast("EGP")
  @scala.inline
  def ERN: typings.dineroDotJs.dineroDotJsStrings.ERN = this.cast("ERN")
  @scala.inline
  def ETB: typings.dineroDotJs.dineroDotJsStrings.ETB = this.cast("ETB")
  @scala.inline
  def EUR: typings.dineroDotJs.dineroDotJsStrings.EUR = this.cast("EUR")
  @scala.inline
  def FJD: typings.dineroDotJs.dineroDotJsStrings.FJD = this.cast("FJD")
  @scala.inline
  def FKP: typings.dineroDotJs.dineroDotJsStrings.FKP = this.cast("FKP")
  @scala.inline
  def GBP: typings.dineroDotJs.dineroDotJsStrings.GBP = this.cast("GBP")
  @scala.inline
  def GEL: typings.dineroDotJs.dineroDotJsStrings.GEL = this.cast("GEL")
  @scala.inline
  def GHS: typings.dineroDotJs.dineroDotJsStrings.GHS = this.cast("GHS")
  @scala.inline
  def GIP: typings.dineroDotJs.dineroDotJsStrings.GIP = this.cast("GIP")
  @scala.inline
  def GMD: typings.dineroDotJs.dineroDotJsStrings.GMD = this.cast("GMD")
  @scala.inline
  def GNF: typings.dineroDotJs.dineroDotJsStrings.GNF = this.cast("GNF")
  @scala.inline
  def GTQ: typings.dineroDotJs.dineroDotJsStrings.GTQ = this.cast("GTQ")
  @scala.inline
  def GYD: typings.dineroDotJs.dineroDotJsStrings.GYD = this.cast("GYD")
  @scala.inline
  def HKD: typings.dineroDotJs.dineroDotJsStrings.HKD = this.cast("HKD")
  @scala.inline
  def HNL: typings.dineroDotJs.dineroDotJsStrings.HNL = this.cast("HNL")
  @scala.inline
  def HRK: typings.dineroDotJs.dineroDotJsStrings.HRK = this.cast("HRK")
  @scala.inline
  def HTG: typings.dineroDotJs.dineroDotJsStrings.HTG = this.cast("HTG")
  @scala.inline
  def HUF: typings.dineroDotJs.dineroDotJsStrings.HUF = this.cast("HUF")
  @scala.inline
  def IDR: typings.dineroDotJs.dineroDotJsStrings.IDR = this.cast("IDR")
  @scala.inline
  def ILS: typings.dineroDotJs.dineroDotJsStrings.ILS = this.cast("ILS")
  @scala.inline
  def INR: typings.dineroDotJs.dineroDotJsStrings.INR = this.cast("INR")
  @scala.inline
  def IQD: typings.dineroDotJs.dineroDotJsStrings.IQD = this.cast("IQD")
  @scala.inline
  def IRR: typings.dineroDotJs.dineroDotJsStrings.IRR = this.cast("IRR")
  @scala.inline
  def ISK: typings.dineroDotJs.dineroDotJsStrings.ISK = this.cast("ISK")
  @scala.inline
  def JMD: typings.dineroDotJs.dineroDotJsStrings.JMD = this.cast("JMD")
  @scala.inline
  def JOD: typings.dineroDotJs.dineroDotJsStrings.JOD = this.cast("JOD")
  @scala.inline
  def JPY: typings.dineroDotJs.dineroDotJsStrings.JPY = this.cast("JPY")
  @scala.inline
  def KES: typings.dineroDotJs.dineroDotJsStrings.KES = this.cast("KES")
  @scala.inline
  def KGS: typings.dineroDotJs.dineroDotJsStrings.KGS = this.cast("KGS")
  @scala.inline
  def KHR: typings.dineroDotJs.dineroDotJsStrings.KHR = this.cast("KHR")
  @scala.inline
  def KMF: typings.dineroDotJs.dineroDotJsStrings.KMF = this.cast("KMF")
  @scala.inline
  def KPW: typings.dineroDotJs.dineroDotJsStrings.KPW = this.cast("KPW")
  @scala.inline
  def KRW: typings.dineroDotJs.dineroDotJsStrings.KRW = this.cast("KRW")
  @scala.inline
  def KWD: typings.dineroDotJs.dineroDotJsStrings.KWD = this.cast("KWD")
  @scala.inline
  def KYD: typings.dineroDotJs.dineroDotJsStrings.KYD = this.cast("KYD")
  @scala.inline
  def KZT: typings.dineroDotJs.dineroDotJsStrings.KZT = this.cast("KZT")
  @scala.inline
  def LAK: typings.dineroDotJs.dineroDotJsStrings.LAK = this.cast("LAK")
  @scala.inline
  def LBP: typings.dineroDotJs.dineroDotJsStrings.LBP = this.cast("LBP")
  @scala.inline
  def LKR: typings.dineroDotJs.dineroDotJsStrings.LKR = this.cast("LKR")
  @scala.inline
  def LRD: typings.dineroDotJs.dineroDotJsStrings.LRD = this.cast("LRD")
  @scala.inline
  def LSL: typings.dineroDotJs.dineroDotJsStrings.LSL = this.cast("LSL")
  @scala.inline
  def LYD: typings.dineroDotJs.dineroDotJsStrings.LYD = this.cast("LYD")
  @scala.inline
  def MAD: typings.dineroDotJs.dineroDotJsStrings.MAD = this.cast("MAD")
  @scala.inline
  def MDL: typings.dineroDotJs.dineroDotJsStrings.MDL = this.cast("MDL")
  @scala.inline
  def MGA: typings.dineroDotJs.dineroDotJsStrings.MGA = this.cast("MGA")
  @scala.inline
  def MKD: typings.dineroDotJs.dineroDotJsStrings.MKD = this.cast("MKD")
  @scala.inline
  def MMK: typings.dineroDotJs.dineroDotJsStrings.MMK = this.cast("MMK")
  @scala.inline
  def MNT: typings.dineroDotJs.dineroDotJsStrings.MNT = this.cast("MNT")
  @scala.inline
  def MOP: typings.dineroDotJs.dineroDotJsStrings.MOP = this.cast("MOP")
  @scala.inline
  def MRU: typings.dineroDotJs.dineroDotJsStrings.MRU = this.cast("MRU")
  @scala.inline
  def MUR: typings.dineroDotJs.dineroDotJsStrings.MUR = this.cast("MUR")
  @scala.inline
  def MVR: typings.dineroDotJs.dineroDotJsStrings.MVR = this.cast("MVR")
  @scala.inline
  def MWK: typings.dineroDotJs.dineroDotJsStrings.MWK = this.cast("MWK")
  @scala.inline
  def MXN: typings.dineroDotJs.dineroDotJsStrings.MXN = this.cast("MXN")
  @scala.inline
  def MXV: typings.dineroDotJs.dineroDotJsStrings.MXV = this.cast("MXV")
  @scala.inline
  def MYR: typings.dineroDotJs.dineroDotJsStrings.MYR = this.cast("MYR")
  @scala.inline
  def MZN: typings.dineroDotJs.dineroDotJsStrings.MZN = this.cast("MZN")
  @scala.inline
  def NAD: typings.dineroDotJs.dineroDotJsStrings.NAD = this.cast("NAD")
  @scala.inline
  def NGN: typings.dineroDotJs.dineroDotJsStrings.NGN = this.cast("NGN")
  @scala.inline
  def NIO: typings.dineroDotJs.dineroDotJsStrings.NIO = this.cast("NIO")
  @scala.inline
  def NOK: typings.dineroDotJs.dineroDotJsStrings.NOK = this.cast("NOK")
  @scala.inline
  def NPR: typings.dineroDotJs.dineroDotJsStrings.NPR = this.cast("NPR")
  @scala.inline
  def NZD: typings.dineroDotJs.dineroDotJsStrings.NZD = this.cast("NZD")
  @scala.inline
  def OMR: typings.dineroDotJs.dineroDotJsStrings.OMR = this.cast("OMR")
  @scala.inline
  def PAB: typings.dineroDotJs.dineroDotJsStrings.PAB = this.cast("PAB")
  @scala.inline
  def PEN: typings.dineroDotJs.dineroDotJsStrings.PEN = this.cast("PEN")
  @scala.inline
  def PGK: typings.dineroDotJs.dineroDotJsStrings.PGK = this.cast("PGK")
  @scala.inline
  def PHP: typings.dineroDotJs.dineroDotJsStrings.PHP = this.cast("PHP")
  @scala.inline
  def PKR: typings.dineroDotJs.dineroDotJsStrings.PKR = this.cast("PKR")
  @scala.inline
  def PLN: typings.dineroDotJs.dineroDotJsStrings.PLN = this.cast("PLN")
  @scala.inline
  def PYG: typings.dineroDotJs.dineroDotJsStrings.PYG = this.cast("PYG")
  @scala.inline
  def QAR: typings.dineroDotJs.dineroDotJsStrings.QAR = this.cast("QAR")
  @scala.inline
  def RON: typings.dineroDotJs.dineroDotJsStrings.RON = this.cast("RON")
  @scala.inline
  def RSD: typings.dineroDotJs.dineroDotJsStrings.RSD = this.cast("RSD")
  @scala.inline
  def RUB: typings.dineroDotJs.dineroDotJsStrings.RUB = this.cast("RUB")
  @scala.inline
  def RWF: typings.dineroDotJs.dineroDotJsStrings.RWF = this.cast("RWF")
  @scala.inline
  def SAR: typings.dineroDotJs.dineroDotJsStrings.SAR = this.cast("SAR")
  @scala.inline
  def SBD: typings.dineroDotJs.dineroDotJsStrings.SBD = this.cast("SBD")
  @scala.inline
  def SCR: typings.dineroDotJs.dineroDotJsStrings.SCR = this.cast("SCR")
  @scala.inline
  def SDG: typings.dineroDotJs.dineroDotJsStrings.SDG = this.cast("SDG")
  @scala.inline
  def SEK: typings.dineroDotJs.dineroDotJsStrings.SEK = this.cast("SEK")
  @scala.inline
  def SGD: typings.dineroDotJs.dineroDotJsStrings.SGD = this.cast("SGD")
  @scala.inline
  def SHP: typings.dineroDotJs.dineroDotJsStrings.SHP = this.cast("SHP")
  @scala.inline
  def SLL: typings.dineroDotJs.dineroDotJsStrings.SLL = this.cast("SLL")
  @scala.inline
  def SOS: typings.dineroDotJs.dineroDotJsStrings.SOS = this.cast("SOS")
  @scala.inline
  def SRD: typings.dineroDotJs.dineroDotJsStrings.SRD = this.cast("SRD")
  @scala.inline
  def SSP: typings.dineroDotJs.dineroDotJsStrings.SSP = this.cast("SSP")
  @scala.inline
  def STN: typings.dineroDotJs.dineroDotJsStrings.STN = this.cast("STN")
  @scala.inline
  def SVC: typings.dineroDotJs.dineroDotJsStrings.SVC = this.cast("SVC")
  @scala.inline
  def SYP: typings.dineroDotJs.dineroDotJsStrings.SYP = this.cast("SYP")
  @scala.inline
  def SZL: typings.dineroDotJs.dineroDotJsStrings.SZL = this.cast("SZL")
  @scala.inline
  def THB: typings.dineroDotJs.dineroDotJsStrings.THB = this.cast("THB")
  @scala.inline
  def TJS: typings.dineroDotJs.dineroDotJsStrings.TJS = this.cast("TJS")
  @scala.inline
  def TMT: typings.dineroDotJs.dineroDotJsStrings.TMT = this.cast("TMT")
  @scala.inline
  def TND: typings.dineroDotJs.dineroDotJsStrings.TND = this.cast("TND")
  @scala.inline
  def TOP: typings.dineroDotJs.dineroDotJsStrings.TOP = this.cast("TOP")
  @scala.inline
  def TRY: typings.dineroDotJs.dineroDotJsStrings.TRY = this.cast("TRY")
  @scala.inline
  def TTD: typings.dineroDotJs.dineroDotJsStrings.TTD = this.cast("TTD")
  @scala.inline
  def TWD: typings.dineroDotJs.dineroDotJsStrings.TWD = this.cast("TWD")
  @scala.inline
  def TZS: typings.dineroDotJs.dineroDotJsStrings.TZS = this.cast("TZS")
  @scala.inline
  def UAH: typings.dineroDotJs.dineroDotJsStrings.UAH = this.cast("UAH")
  @scala.inline
  def UGX: typings.dineroDotJs.dineroDotJsStrings.UGX = this.cast("UGX")
  @scala.inline
  def USD: typings.dineroDotJs.dineroDotJsStrings.USD = this.cast("USD")
  @scala.inline
  def USN: typings.dineroDotJs.dineroDotJsStrings.USN = this.cast("USN")
  @scala.inline
  def UYI: typings.dineroDotJs.dineroDotJsStrings.UYI = this.cast("UYI")
  @scala.inline
  def UYU: typings.dineroDotJs.dineroDotJsStrings.UYU = this.cast("UYU")
  @scala.inline
  def UYW: typings.dineroDotJs.dineroDotJsStrings.UYW = this.cast("UYW")
  @scala.inline
  def UZS: typings.dineroDotJs.dineroDotJsStrings.UZS = this.cast("UZS")
  @scala.inline
  def VES: typings.dineroDotJs.dineroDotJsStrings.VES = this.cast("VES")
  @scala.inline
  def VND: typings.dineroDotJs.dineroDotJsStrings.VND = this.cast("VND")
  @scala.inline
  def VUV: typings.dineroDotJs.dineroDotJsStrings.VUV = this.cast("VUV")
  @scala.inline
  def WST: typings.dineroDotJs.dineroDotJsStrings.WST = this.cast("WST")
  @scala.inline
  def XAF: typings.dineroDotJs.dineroDotJsStrings.XAF = this.cast("XAF")
  @scala.inline
  def XAG: typings.dineroDotJs.dineroDotJsStrings.XAG = this.cast("XAG")
  @scala.inline
  def XAU: typings.dineroDotJs.dineroDotJsStrings.XAU = this.cast("XAU")
  @scala.inline
  def XBA: typings.dineroDotJs.dineroDotJsStrings.XBA = this.cast("XBA")
  @scala.inline
  def XBB: typings.dineroDotJs.dineroDotJsStrings.XBB = this.cast("XBB")
  @scala.inline
  def XBC: typings.dineroDotJs.dineroDotJsStrings.XBC = this.cast("XBC")
  @scala.inline
  def XBD: typings.dineroDotJs.dineroDotJsStrings.XBD = this.cast("XBD")
  @scala.inline
  def XCD: typings.dineroDotJs.dineroDotJsStrings.XCD = this.cast("XCD")
  @scala.inline
  def XDR: typings.dineroDotJs.dineroDotJsStrings.XDR = this.cast("XDR")
  @scala.inline
  def XOF: typings.dineroDotJs.dineroDotJsStrings.XOF = this.cast("XOF")
  @scala.inline
  def XPD: typings.dineroDotJs.dineroDotJsStrings.XPD = this.cast("XPD")
  @scala.inline
  def XPF: typings.dineroDotJs.dineroDotJsStrings.XPF = this.cast("XPF")
  @scala.inline
  def XPT: typings.dineroDotJs.dineroDotJsStrings.XPT = this.cast("XPT")
  @scala.inline
  def XSU: typings.dineroDotJs.dineroDotJsStrings.XSU = this.cast("XSU")
  @scala.inline
  def XTS: typings.dineroDotJs.dineroDotJsStrings.XTS = this.cast("XTS")
  @scala.inline
  def XUA: typings.dineroDotJs.dineroDotJsStrings.XUA = this.cast("XUA")
  @scala.inline
  def XXX: typings.dineroDotJs.dineroDotJsStrings.XXX = this.cast("XXX")
  @scala.inline
  def YER: typings.dineroDotJs.dineroDotJsStrings.YER = this.cast("YER")
  @scala.inline
  def ZAR: typings.dineroDotJs.dineroDotJsStrings.ZAR = this.cast("ZAR")
  @scala.inline
  def ZMW: typings.dineroDotJs.dineroDotJsStrings.ZMW = this.cast("ZMW")
  @scala.inline
  def ZWL: typings.dineroDotJs.dineroDotJsStrings.ZWL = this.cast("ZWL")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

