package typings.dineroJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ISO 4217 CURRENCY CODES as specified in the documentation
  * Taken from https://www.iso.org/iso-4217-currency-codes.html
  * sorted and parsed
  */
/* Rewritten from type alias, can be one of: 
  - typings.dineroJs.dineroJsStrings.AED
  - typings.dineroJs.dineroJsStrings.AFN
  - typings.dineroJs.dineroJsStrings.ALL
  - typings.dineroJs.dineroJsStrings.AMD
  - typings.dineroJs.dineroJsStrings.ANG
  - typings.dineroJs.dineroJsStrings.AOA
  - typings.dineroJs.dineroJsStrings.ARS
  - typings.dineroJs.dineroJsStrings.AUD
  - typings.dineroJs.dineroJsStrings.AWG
  - typings.dineroJs.dineroJsStrings.AZN
  - typings.dineroJs.dineroJsStrings.BAM
  - typings.dineroJs.dineroJsStrings.BBD
  - typings.dineroJs.dineroJsStrings.BDT
  - typings.dineroJs.dineroJsStrings.BGN
  - typings.dineroJs.dineroJsStrings.BHD
  - typings.dineroJs.dineroJsStrings.BIF
  - typings.dineroJs.dineroJsStrings.BMD
  - typings.dineroJs.dineroJsStrings.BND
  - typings.dineroJs.dineroJsStrings.BOB
  - typings.dineroJs.dineroJsStrings.BOV
  - typings.dineroJs.dineroJsStrings.BRL
  - typings.dineroJs.dineroJsStrings.BSD
  - typings.dineroJs.dineroJsStrings.BTN
  - typings.dineroJs.dineroJsStrings.BWP
  - typings.dineroJs.dineroJsStrings.BYN
  - typings.dineroJs.dineroJsStrings.BZD
  - typings.dineroJs.dineroJsStrings.CAD
  - typings.dineroJs.dineroJsStrings.CDF
  - typings.dineroJs.dineroJsStrings.CHE
  - typings.dineroJs.dineroJsStrings.CHF
  - typings.dineroJs.dineroJsStrings.CHW
  - typings.dineroJs.dineroJsStrings.CLF
  - typings.dineroJs.dineroJsStrings.CLP
  - typings.dineroJs.dineroJsStrings.CNY
  - typings.dineroJs.dineroJsStrings.COP
  - typings.dineroJs.dineroJsStrings.COU
  - typings.dineroJs.dineroJsStrings.CRC
  - typings.dineroJs.dineroJsStrings.CUC
  - typings.dineroJs.dineroJsStrings.CUP
  - typings.dineroJs.dineroJsStrings.CVE
  - typings.dineroJs.dineroJsStrings.CZK
  - typings.dineroJs.dineroJsStrings.DJF
  - typings.dineroJs.dineroJsStrings.DKK
  - typings.dineroJs.dineroJsStrings.DOP
  - typings.dineroJs.dineroJsStrings.DZD
  - typings.dineroJs.dineroJsStrings.EGP
  - typings.dineroJs.dineroJsStrings.ERN
  - typings.dineroJs.dineroJsStrings.ETB
  - typings.dineroJs.dineroJsStrings.EUR
  - typings.dineroJs.dineroJsStrings.FJD
  - typings.dineroJs.dineroJsStrings.FKP
  - typings.dineroJs.dineroJsStrings.GBP
  - typings.dineroJs.dineroJsStrings.GEL
  - typings.dineroJs.dineroJsStrings.GHS
  - typings.dineroJs.dineroJsStrings.GIP
  - typings.dineroJs.dineroJsStrings.GMD
  - typings.dineroJs.dineroJsStrings.GNF
  - typings.dineroJs.dineroJsStrings.GTQ
  - typings.dineroJs.dineroJsStrings.GYD
  - typings.dineroJs.dineroJsStrings.HKD
  - typings.dineroJs.dineroJsStrings.HNL
  - typings.dineroJs.dineroJsStrings.HRK
  - typings.dineroJs.dineroJsStrings.HTG
  - typings.dineroJs.dineroJsStrings.HUF
  - typings.dineroJs.dineroJsStrings.IDR
  - typings.dineroJs.dineroJsStrings.ILS
  - typings.dineroJs.dineroJsStrings.INR
  - typings.dineroJs.dineroJsStrings.IQD
  - typings.dineroJs.dineroJsStrings.IRR
  - typings.dineroJs.dineroJsStrings.ISK
  - typings.dineroJs.dineroJsStrings.JMD
  - typings.dineroJs.dineroJsStrings.JOD
  - typings.dineroJs.dineroJsStrings.JPY
  - typings.dineroJs.dineroJsStrings.KES
  - typings.dineroJs.dineroJsStrings.KGS
  - typings.dineroJs.dineroJsStrings.KHR
  - typings.dineroJs.dineroJsStrings.KMF
  - typings.dineroJs.dineroJsStrings.KPW
  - typings.dineroJs.dineroJsStrings.KRW
  - typings.dineroJs.dineroJsStrings.KWD
  - typings.dineroJs.dineroJsStrings.KYD
  - typings.dineroJs.dineroJsStrings.KZT
  - typings.dineroJs.dineroJsStrings.LAK
  - typings.dineroJs.dineroJsStrings.LBP
  - typings.dineroJs.dineroJsStrings.LKR
  - typings.dineroJs.dineroJsStrings.LRD
  - typings.dineroJs.dineroJsStrings.LSL
  - typings.dineroJs.dineroJsStrings.LYD
  - typings.dineroJs.dineroJsStrings.MAD
  - typings.dineroJs.dineroJsStrings.MDL
  - typings.dineroJs.dineroJsStrings.MGA
  - typings.dineroJs.dineroJsStrings.MKD
  - typings.dineroJs.dineroJsStrings.MMK
  - typings.dineroJs.dineroJsStrings.MNT
  - typings.dineroJs.dineroJsStrings.MOP
  - typings.dineroJs.dineroJsStrings.MRU
  - typings.dineroJs.dineroJsStrings.MUR
  - typings.dineroJs.dineroJsStrings.MVR
  - typings.dineroJs.dineroJsStrings.MWK
  - typings.dineroJs.dineroJsStrings.MXN
  - typings.dineroJs.dineroJsStrings.MXV
  - typings.dineroJs.dineroJsStrings.MYR
  - typings.dineroJs.dineroJsStrings.MZN
  - typings.dineroJs.dineroJsStrings.NAD
  - typings.dineroJs.dineroJsStrings.NGN
  - typings.dineroJs.dineroJsStrings.NIO
  - typings.dineroJs.dineroJsStrings.NOK
  - typings.dineroJs.dineroJsStrings.NPR
  - typings.dineroJs.dineroJsStrings.NZD
  - typings.dineroJs.dineroJsStrings.OMR
  - typings.dineroJs.dineroJsStrings.PAB
  - typings.dineroJs.dineroJsStrings.PEN
  - typings.dineroJs.dineroJsStrings.PGK
  - typings.dineroJs.dineroJsStrings.PHP
  - typings.dineroJs.dineroJsStrings.PKR
  - typings.dineroJs.dineroJsStrings.PLN
  - typings.dineroJs.dineroJsStrings.PYG
  - typings.dineroJs.dineroJsStrings.QAR
  - typings.dineroJs.dineroJsStrings.RON
  - typings.dineroJs.dineroJsStrings.RSD
  - typings.dineroJs.dineroJsStrings.RUB
  - typings.dineroJs.dineroJsStrings.RWF
  - typings.dineroJs.dineroJsStrings.SAR
  - typings.dineroJs.dineroJsStrings.SBD
  - typings.dineroJs.dineroJsStrings.SCR
  - typings.dineroJs.dineroJsStrings.SDG
  - typings.dineroJs.dineroJsStrings.SEK
  - typings.dineroJs.dineroJsStrings.SGD
  - typings.dineroJs.dineroJsStrings.SHP
  - typings.dineroJs.dineroJsStrings.SLL
  - typings.dineroJs.dineroJsStrings.SOS
  - typings.dineroJs.dineroJsStrings.SRD
  - typings.dineroJs.dineroJsStrings.SSP
  - typings.dineroJs.dineroJsStrings.STN
  - typings.dineroJs.dineroJsStrings.SVC
  - typings.dineroJs.dineroJsStrings.SYP
  - typings.dineroJs.dineroJsStrings.SZL
  - typings.dineroJs.dineroJsStrings.THB
  - typings.dineroJs.dineroJsStrings.TJS
  - typings.dineroJs.dineroJsStrings.TMT
  - typings.dineroJs.dineroJsStrings.TND
  - typings.dineroJs.dineroJsStrings.TOP
  - typings.dineroJs.dineroJsStrings.TRY
  - typings.dineroJs.dineroJsStrings.TTD
  - typings.dineroJs.dineroJsStrings.TWD
  - typings.dineroJs.dineroJsStrings.TZS
  - typings.dineroJs.dineroJsStrings.UAH
  - typings.dineroJs.dineroJsStrings.UGX
  - typings.dineroJs.dineroJsStrings.USD
  - typings.dineroJs.dineroJsStrings.USN
  - typings.dineroJs.dineroJsStrings.UYI
  - typings.dineroJs.dineroJsStrings.UYU
  - typings.dineroJs.dineroJsStrings.UYW
  - typings.dineroJs.dineroJsStrings.UZS
  - typings.dineroJs.dineroJsStrings.VES
  - typings.dineroJs.dineroJsStrings.VND
  - typings.dineroJs.dineroJsStrings.VUV
  - typings.dineroJs.dineroJsStrings.WST
  - typings.dineroJs.dineroJsStrings.XAF
  - typings.dineroJs.dineroJsStrings.XAG
  - typings.dineroJs.dineroJsStrings.XAU
  - typings.dineroJs.dineroJsStrings.XBA
  - typings.dineroJs.dineroJsStrings.XBB
  - typings.dineroJs.dineroJsStrings.XBC
  - typings.dineroJs.dineroJsStrings.XBD
  - typings.dineroJs.dineroJsStrings.XCD
  - typings.dineroJs.dineroJsStrings.XDR
  - typings.dineroJs.dineroJsStrings.XOF
  - typings.dineroJs.dineroJsStrings.XPD
  - typings.dineroJs.dineroJsStrings.XPF
  - typings.dineroJs.dineroJsStrings.XPT
  - typings.dineroJs.dineroJsStrings.XSU
  - typings.dineroJs.dineroJsStrings.XTS
  - typings.dineroJs.dineroJsStrings.XUA
  - typings.dineroJs.dineroJsStrings.XXX
  - typings.dineroJs.dineroJsStrings.YER
  - typings.dineroJs.dineroJsStrings.ZAR
  - typings.dineroJs.dineroJsStrings.ZMW
  - typings.dineroJs.dineroJsStrings.ZWL
*/
trait Currency extends js.Object

object Currency {
  @scala.inline
  def AED: typings.dineroJs.dineroJsStrings.AED = this.cast("AED")
  @scala.inline
  def AFN: typings.dineroJs.dineroJsStrings.AFN = this.cast("AFN")
  @scala.inline
  def ALL: typings.dineroJs.dineroJsStrings.ALL = this.cast("ALL")
  @scala.inline
  def AMD: typings.dineroJs.dineroJsStrings.AMD = this.cast("AMD")
  @scala.inline
  def ANG: typings.dineroJs.dineroJsStrings.ANG = this.cast("ANG")
  @scala.inline
  def AOA: typings.dineroJs.dineroJsStrings.AOA = this.cast("AOA")
  @scala.inline
  def ARS: typings.dineroJs.dineroJsStrings.ARS = this.cast("ARS")
  @scala.inline
  def AUD: typings.dineroJs.dineroJsStrings.AUD = this.cast("AUD")
  @scala.inline
  def AWG: typings.dineroJs.dineroJsStrings.AWG = this.cast("AWG")
  @scala.inline
  def AZN: typings.dineroJs.dineroJsStrings.AZN = this.cast("AZN")
  @scala.inline
  def BAM: typings.dineroJs.dineroJsStrings.BAM = this.cast("BAM")
  @scala.inline
  def BBD: typings.dineroJs.dineroJsStrings.BBD = this.cast("BBD")
  @scala.inline
  def BDT: typings.dineroJs.dineroJsStrings.BDT = this.cast("BDT")
  @scala.inline
  def BGN: typings.dineroJs.dineroJsStrings.BGN = this.cast("BGN")
  @scala.inline
  def BHD: typings.dineroJs.dineroJsStrings.BHD = this.cast("BHD")
  @scala.inline
  def BIF: typings.dineroJs.dineroJsStrings.BIF = this.cast("BIF")
  @scala.inline
  def BMD: typings.dineroJs.dineroJsStrings.BMD = this.cast("BMD")
  @scala.inline
  def BND: typings.dineroJs.dineroJsStrings.BND = this.cast("BND")
  @scala.inline
  def BOB: typings.dineroJs.dineroJsStrings.BOB = this.cast("BOB")
  @scala.inline
  def BOV: typings.dineroJs.dineroJsStrings.BOV = this.cast("BOV")
  @scala.inline
  def BRL: typings.dineroJs.dineroJsStrings.BRL = this.cast("BRL")
  @scala.inline
  def BSD: typings.dineroJs.dineroJsStrings.BSD = this.cast("BSD")
  @scala.inline
  def BTN: typings.dineroJs.dineroJsStrings.BTN = this.cast("BTN")
  @scala.inline
  def BWP: typings.dineroJs.dineroJsStrings.BWP = this.cast("BWP")
  @scala.inline
  def BYN: typings.dineroJs.dineroJsStrings.BYN = this.cast("BYN")
  @scala.inline
  def BZD: typings.dineroJs.dineroJsStrings.BZD = this.cast("BZD")
  @scala.inline
  def CAD: typings.dineroJs.dineroJsStrings.CAD = this.cast("CAD")
  @scala.inline
  def CDF: typings.dineroJs.dineroJsStrings.CDF = this.cast("CDF")
  @scala.inline
  def CHE: typings.dineroJs.dineroJsStrings.CHE = this.cast("CHE")
  @scala.inline
  def CHF: typings.dineroJs.dineroJsStrings.CHF = this.cast("CHF")
  @scala.inline
  def CHW: typings.dineroJs.dineroJsStrings.CHW = this.cast("CHW")
  @scala.inline
  def CLF: typings.dineroJs.dineroJsStrings.CLF = this.cast("CLF")
  @scala.inline
  def CLP: typings.dineroJs.dineroJsStrings.CLP = this.cast("CLP")
  @scala.inline
  def CNY: typings.dineroJs.dineroJsStrings.CNY = this.cast("CNY")
  @scala.inline
  def COP: typings.dineroJs.dineroJsStrings.COP = this.cast("COP")
  @scala.inline
  def COU: typings.dineroJs.dineroJsStrings.COU = this.cast("COU")
  @scala.inline
  def CRC: typings.dineroJs.dineroJsStrings.CRC = this.cast("CRC")
  @scala.inline
  def CUC: typings.dineroJs.dineroJsStrings.CUC = this.cast("CUC")
  @scala.inline
  def CUP: typings.dineroJs.dineroJsStrings.CUP = this.cast("CUP")
  @scala.inline
  def CVE: typings.dineroJs.dineroJsStrings.CVE = this.cast("CVE")
  @scala.inline
  def CZK: typings.dineroJs.dineroJsStrings.CZK = this.cast("CZK")
  @scala.inline
  def DJF: typings.dineroJs.dineroJsStrings.DJF = this.cast("DJF")
  @scala.inline
  def DKK: typings.dineroJs.dineroJsStrings.DKK = this.cast("DKK")
  @scala.inline
  def DOP: typings.dineroJs.dineroJsStrings.DOP = this.cast("DOP")
  @scala.inline
  def DZD: typings.dineroJs.dineroJsStrings.DZD = this.cast("DZD")
  @scala.inline
  def EGP: typings.dineroJs.dineroJsStrings.EGP = this.cast("EGP")
  @scala.inline
  def ERN: typings.dineroJs.dineroJsStrings.ERN = this.cast("ERN")
  @scala.inline
  def ETB: typings.dineroJs.dineroJsStrings.ETB = this.cast("ETB")
  @scala.inline
  def EUR: typings.dineroJs.dineroJsStrings.EUR = this.cast("EUR")
  @scala.inline
  def FJD: typings.dineroJs.dineroJsStrings.FJD = this.cast("FJD")
  @scala.inline
  def FKP: typings.dineroJs.dineroJsStrings.FKP = this.cast("FKP")
  @scala.inline
  def GBP: typings.dineroJs.dineroJsStrings.GBP = this.cast("GBP")
  @scala.inline
  def GEL: typings.dineroJs.dineroJsStrings.GEL = this.cast("GEL")
  @scala.inline
  def GHS: typings.dineroJs.dineroJsStrings.GHS = this.cast("GHS")
  @scala.inline
  def GIP: typings.dineroJs.dineroJsStrings.GIP = this.cast("GIP")
  @scala.inline
  def GMD: typings.dineroJs.dineroJsStrings.GMD = this.cast("GMD")
  @scala.inline
  def GNF: typings.dineroJs.dineroJsStrings.GNF = this.cast("GNF")
  @scala.inline
  def GTQ: typings.dineroJs.dineroJsStrings.GTQ = this.cast("GTQ")
  @scala.inline
  def GYD: typings.dineroJs.dineroJsStrings.GYD = this.cast("GYD")
  @scala.inline
  def HKD: typings.dineroJs.dineroJsStrings.HKD = this.cast("HKD")
  @scala.inline
  def HNL: typings.dineroJs.dineroJsStrings.HNL = this.cast("HNL")
  @scala.inline
  def HRK: typings.dineroJs.dineroJsStrings.HRK = this.cast("HRK")
  @scala.inline
  def HTG: typings.dineroJs.dineroJsStrings.HTG = this.cast("HTG")
  @scala.inline
  def HUF: typings.dineroJs.dineroJsStrings.HUF = this.cast("HUF")
  @scala.inline
  def IDR: typings.dineroJs.dineroJsStrings.IDR = this.cast("IDR")
  @scala.inline
  def ILS: typings.dineroJs.dineroJsStrings.ILS = this.cast("ILS")
  @scala.inline
  def INR: typings.dineroJs.dineroJsStrings.INR = this.cast("INR")
  @scala.inline
  def IQD: typings.dineroJs.dineroJsStrings.IQD = this.cast("IQD")
  @scala.inline
  def IRR: typings.dineroJs.dineroJsStrings.IRR = this.cast("IRR")
  @scala.inline
  def ISK: typings.dineroJs.dineroJsStrings.ISK = this.cast("ISK")
  @scala.inline
  def JMD: typings.dineroJs.dineroJsStrings.JMD = this.cast("JMD")
  @scala.inline
  def JOD: typings.dineroJs.dineroJsStrings.JOD = this.cast("JOD")
  @scala.inline
  def JPY: typings.dineroJs.dineroJsStrings.JPY = this.cast("JPY")
  @scala.inline
  def KES: typings.dineroJs.dineroJsStrings.KES = this.cast("KES")
  @scala.inline
  def KGS: typings.dineroJs.dineroJsStrings.KGS = this.cast("KGS")
  @scala.inline
  def KHR: typings.dineroJs.dineroJsStrings.KHR = this.cast("KHR")
  @scala.inline
  def KMF: typings.dineroJs.dineroJsStrings.KMF = this.cast("KMF")
  @scala.inline
  def KPW: typings.dineroJs.dineroJsStrings.KPW = this.cast("KPW")
  @scala.inline
  def KRW: typings.dineroJs.dineroJsStrings.KRW = this.cast("KRW")
  @scala.inline
  def KWD: typings.dineroJs.dineroJsStrings.KWD = this.cast("KWD")
  @scala.inline
  def KYD: typings.dineroJs.dineroJsStrings.KYD = this.cast("KYD")
  @scala.inline
  def KZT: typings.dineroJs.dineroJsStrings.KZT = this.cast("KZT")
  @scala.inline
  def LAK: typings.dineroJs.dineroJsStrings.LAK = this.cast("LAK")
  @scala.inline
  def LBP: typings.dineroJs.dineroJsStrings.LBP = this.cast("LBP")
  @scala.inline
  def LKR: typings.dineroJs.dineroJsStrings.LKR = this.cast("LKR")
  @scala.inline
  def LRD: typings.dineroJs.dineroJsStrings.LRD = this.cast("LRD")
  @scala.inline
  def LSL: typings.dineroJs.dineroJsStrings.LSL = this.cast("LSL")
  @scala.inline
  def LYD: typings.dineroJs.dineroJsStrings.LYD = this.cast("LYD")
  @scala.inline
  def MAD: typings.dineroJs.dineroJsStrings.MAD = this.cast("MAD")
  @scala.inline
  def MDL: typings.dineroJs.dineroJsStrings.MDL = this.cast("MDL")
  @scala.inline
  def MGA: typings.dineroJs.dineroJsStrings.MGA = this.cast("MGA")
  @scala.inline
  def MKD: typings.dineroJs.dineroJsStrings.MKD = this.cast("MKD")
  @scala.inline
  def MMK: typings.dineroJs.dineroJsStrings.MMK = this.cast("MMK")
  @scala.inline
  def MNT: typings.dineroJs.dineroJsStrings.MNT = this.cast("MNT")
  @scala.inline
  def MOP: typings.dineroJs.dineroJsStrings.MOP = this.cast("MOP")
  @scala.inline
  def MRU: typings.dineroJs.dineroJsStrings.MRU = this.cast("MRU")
  @scala.inline
  def MUR: typings.dineroJs.dineroJsStrings.MUR = this.cast("MUR")
  @scala.inline
  def MVR: typings.dineroJs.dineroJsStrings.MVR = this.cast("MVR")
  @scala.inline
  def MWK: typings.dineroJs.dineroJsStrings.MWK = this.cast("MWK")
  @scala.inline
  def MXN: typings.dineroJs.dineroJsStrings.MXN = this.cast("MXN")
  @scala.inline
  def MXV: typings.dineroJs.dineroJsStrings.MXV = this.cast("MXV")
  @scala.inline
  def MYR: typings.dineroJs.dineroJsStrings.MYR = this.cast("MYR")
  @scala.inline
  def MZN: typings.dineroJs.dineroJsStrings.MZN = this.cast("MZN")
  @scala.inline
  def NAD: typings.dineroJs.dineroJsStrings.NAD = this.cast("NAD")
  @scala.inline
  def NGN: typings.dineroJs.dineroJsStrings.NGN = this.cast("NGN")
  @scala.inline
  def NIO: typings.dineroJs.dineroJsStrings.NIO = this.cast("NIO")
  @scala.inline
  def NOK: typings.dineroJs.dineroJsStrings.NOK = this.cast("NOK")
  @scala.inline
  def NPR: typings.dineroJs.dineroJsStrings.NPR = this.cast("NPR")
  @scala.inline
  def NZD: typings.dineroJs.dineroJsStrings.NZD = this.cast("NZD")
  @scala.inline
  def OMR: typings.dineroJs.dineroJsStrings.OMR = this.cast("OMR")
  @scala.inline
  def PAB: typings.dineroJs.dineroJsStrings.PAB = this.cast("PAB")
  @scala.inline
  def PEN: typings.dineroJs.dineroJsStrings.PEN = this.cast("PEN")
  @scala.inline
  def PGK: typings.dineroJs.dineroJsStrings.PGK = this.cast("PGK")
  @scala.inline
  def PHP: typings.dineroJs.dineroJsStrings.PHP = this.cast("PHP")
  @scala.inline
  def PKR: typings.dineroJs.dineroJsStrings.PKR = this.cast("PKR")
  @scala.inline
  def PLN: typings.dineroJs.dineroJsStrings.PLN = this.cast("PLN")
  @scala.inline
  def PYG: typings.dineroJs.dineroJsStrings.PYG = this.cast("PYG")
  @scala.inline
  def QAR: typings.dineroJs.dineroJsStrings.QAR = this.cast("QAR")
  @scala.inline
  def RON: typings.dineroJs.dineroJsStrings.RON = this.cast("RON")
  @scala.inline
  def RSD: typings.dineroJs.dineroJsStrings.RSD = this.cast("RSD")
  @scala.inline
  def RUB: typings.dineroJs.dineroJsStrings.RUB = this.cast("RUB")
  @scala.inline
  def RWF: typings.dineroJs.dineroJsStrings.RWF = this.cast("RWF")
  @scala.inline
  def SAR: typings.dineroJs.dineroJsStrings.SAR = this.cast("SAR")
  @scala.inline
  def SBD: typings.dineroJs.dineroJsStrings.SBD = this.cast("SBD")
  @scala.inline
  def SCR: typings.dineroJs.dineroJsStrings.SCR = this.cast("SCR")
  @scala.inline
  def SDG: typings.dineroJs.dineroJsStrings.SDG = this.cast("SDG")
  @scala.inline
  def SEK: typings.dineroJs.dineroJsStrings.SEK = this.cast("SEK")
  @scala.inline
  def SGD: typings.dineroJs.dineroJsStrings.SGD = this.cast("SGD")
  @scala.inline
  def SHP: typings.dineroJs.dineroJsStrings.SHP = this.cast("SHP")
  @scala.inline
  def SLL: typings.dineroJs.dineroJsStrings.SLL = this.cast("SLL")
  @scala.inline
  def SOS: typings.dineroJs.dineroJsStrings.SOS = this.cast("SOS")
  @scala.inline
  def SRD: typings.dineroJs.dineroJsStrings.SRD = this.cast("SRD")
  @scala.inline
  def SSP: typings.dineroJs.dineroJsStrings.SSP = this.cast("SSP")
  @scala.inline
  def STN: typings.dineroJs.dineroJsStrings.STN = this.cast("STN")
  @scala.inline
  def SVC: typings.dineroJs.dineroJsStrings.SVC = this.cast("SVC")
  @scala.inline
  def SYP: typings.dineroJs.dineroJsStrings.SYP = this.cast("SYP")
  @scala.inline
  def SZL: typings.dineroJs.dineroJsStrings.SZL = this.cast("SZL")
  @scala.inline
  def THB: typings.dineroJs.dineroJsStrings.THB = this.cast("THB")
  @scala.inline
  def TJS: typings.dineroJs.dineroJsStrings.TJS = this.cast("TJS")
  @scala.inline
  def TMT: typings.dineroJs.dineroJsStrings.TMT = this.cast("TMT")
  @scala.inline
  def TND: typings.dineroJs.dineroJsStrings.TND = this.cast("TND")
  @scala.inline
  def TOP: typings.dineroJs.dineroJsStrings.TOP = this.cast("TOP")
  @scala.inline
  def TRY: typings.dineroJs.dineroJsStrings.TRY = this.cast("TRY")
  @scala.inline
  def TTD: typings.dineroJs.dineroJsStrings.TTD = this.cast("TTD")
  @scala.inline
  def TWD: typings.dineroJs.dineroJsStrings.TWD = this.cast("TWD")
  @scala.inline
  def TZS: typings.dineroJs.dineroJsStrings.TZS = this.cast("TZS")
  @scala.inline
  def UAH: typings.dineroJs.dineroJsStrings.UAH = this.cast("UAH")
  @scala.inline
  def UGX: typings.dineroJs.dineroJsStrings.UGX = this.cast("UGX")
  @scala.inline
  def USD: typings.dineroJs.dineroJsStrings.USD = this.cast("USD")
  @scala.inline
  def USN: typings.dineroJs.dineroJsStrings.USN = this.cast("USN")
  @scala.inline
  def UYI: typings.dineroJs.dineroJsStrings.UYI = this.cast("UYI")
  @scala.inline
  def UYU: typings.dineroJs.dineroJsStrings.UYU = this.cast("UYU")
  @scala.inline
  def UYW: typings.dineroJs.dineroJsStrings.UYW = this.cast("UYW")
  @scala.inline
  def UZS: typings.dineroJs.dineroJsStrings.UZS = this.cast("UZS")
  @scala.inline
  def VES: typings.dineroJs.dineroJsStrings.VES = this.cast("VES")
  @scala.inline
  def VND: typings.dineroJs.dineroJsStrings.VND = this.cast("VND")
  @scala.inline
  def VUV: typings.dineroJs.dineroJsStrings.VUV = this.cast("VUV")
  @scala.inline
  def WST: typings.dineroJs.dineroJsStrings.WST = this.cast("WST")
  @scala.inline
  def XAF: typings.dineroJs.dineroJsStrings.XAF = this.cast("XAF")
  @scala.inline
  def XAG: typings.dineroJs.dineroJsStrings.XAG = this.cast("XAG")
  @scala.inline
  def XAU: typings.dineroJs.dineroJsStrings.XAU = this.cast("XAU")
  @scala.inline
  def XBA: typings.dineroJs.dineroJsStrings.XBA = this.cast("XBA")
  @scala.inline
  def XBB: typings.dineroJs.dineroJsStrings.XBB = this.cast("XBB")
  @scala.inline
  def XBC: typings.dineroJs.dineroJsStrings.XBC = this.cast("XBC")
  @scala.inline
  def XBD: typings.dineroJs.dineroJsStrings.XBD = this.cast("XBD")
  @scala.inline
  def XCD: typings.dineroJs.dineroJsStrings.XCD = this.cast("XCD")
  @scala.inline
  def XDR: typings.dineroJs.dineroJsStrings.XDR = this.cast("XDR")
  @scala.inline
  def XOF: typings.dineroJs.dineroJsStrings.XOF = this.cast("XOF")
  @scala.inline
  def XPD: typings.dineroJs.dineroJsStrings.XPD = this.cast("XPD")
  @scala.inline
  def XPF: typings.dineroJs.dineroJsStrings.XPF = this.cast("XPF")
  @scala.inline
  def XPT: typings.dineroJs.dineroJsStrings.XPT = this.cast("XPT")
  @scala.inline
  def XSU: typings.dineroJs.dineroJsStrings.XSU = this.cast("XSU")
  @scala.inline
  def XTS: typings.dineroJs.dineroJsStrings.XTS = this.cast("XTS")
  @scala.inline
  def XUA: typings.dineroJs.dineroJsStrings.XUA = this.cast("XUA")
  @scala.inline
  def XXX: typings.dineroJs.dineroJsStrings.XXX = this.cast("XXX")
  @scala.inline
  def YER: typings.dineroJs.dineroJsStrings.YER = this.cast("YER")
  @scala.inline
  def ZAR: typings.dineroJs.dineroJsStrings.ZAR = this.cast("ZAR")
  @scala.inline
  def ZMW: typings.dineroJs.dineroJsStrings.ZMW = this.cast("ZMW")
  @scala.inline
  def ZWL: typings.dineroJs.dineroJsStrings.ZWL = this.cast("ZWL")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

