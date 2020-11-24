package typings.dockerode

import typings.dockerode.mod.LoggingDriverType
import typings.dockerode.mod.MountConsistency
import typings.dockerode.mod.MountPropagation
import typings.dockerode.mod.MountType
import typings.dockerode.mod.UpdateState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dockerodeStrings {
  
  @scala.inline
  def attachment: attachment = "attachment".asInstanceOf[attachment]
  
  @scala.inline
  def awslogs: awslogs = "awslogs".asInstanceOf[awslogs]
  
  @scala.inline
  def bind: bind = "bind".asInstanceOf[bind]
  
  @scala.inline
  def cached: cached = "cached".asInstanceOf[cached]
  
  @scala.inline
  def cfssl: cfssl = "cfssl".asInstanceOf[cfssl]
  
  @scala.inline
  def completed: completed = "completed".asInstanceOf[completed]
  
  @scala.inline
  def config: config = "config".asInstanceOf[config]
  
  @scala.inline
  def consistent: consistent = "consistent".asInstanceOf[consistent]
  
  @scala.inline
  def container: container = "container".asInstanceOf[container]
  
  @scala.inline
  def daemon: daemon = "daemon".asInstanceOf[daemon]
  
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @scala.inline
  def delegated: delegated = "delegated".asInstanceOf[delegated]
  
  @scala.inline
  def etwlogs: etwlogs = "etwlogs".asInstanceOf[etwlogs]
  
  @scala.inline
  def fluentd: fluentd = "fluentd".asInstanceOf[fluentd]
  
  @scala.inline
  def gelf: gelf = "gelf".asInstanceOf[gelf]
  
  @scala.inline
  def global: global = "global".asInstanceOf[global]
  
  @scala.inline
  def host: host = "host".asInstanceOf[host]
  
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  
  @scala.inline
  def ingress: ingress = "ingress".asInstanceOf[ingress]
  
  @scala.inline
  def journald: journald = "journald".asInstanceOf[journald]
  
  @scala.inline
  def `json-file`: `json-file` = "json-file".asInstanceOf[`json-file`]
  
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  
  @scala.inline
  def network: network = "network".asInstanceOf[network]
  
  @scala.inline
  def `next-exit`: `next-exit` = "next-exit".asInstanceOf[`next-exit`]
  
  @scala.inline
  def node: node = "node".asInstanceOf[node]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def `not-running`: `not-running` = "not-running".asInstanceOf[`not-running`]
  
  @scala.inline
  def paused: paused = "paused".asInstanceOf[paused]
  
  @scala.inline
  def plugin: plugin = "plugin".asInstanceOf[plugin]
  
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  
  @scala.inline
  def removed: removed = "removed".asInstanceOf[removed]
  
  @scala.inline
  def replicated: replicated = "replicated".asInstanceOf[replicated]
  
  @scala.inline
  def rollback_completed: rollback_completed = "rollback_completed".asInstanceOf[rollback_completed]
  
  @scala.inline
  def rollback_paused: rollback_paused = "rollback_paused".asInstanceOf[rollback_paused]
  
  @scala.inline
  def rollback_started: rollback_started = "rollback_started".asInstanceOf[rollback_started]
  
  @scala.inline
  def rprivate: rprivate = "rprivate".asInstanceOf[rprivate]
  
  @scala.inline
  def rshared: rshared = "rshared".asInstanceOf[rshared]
  
  @scala.inline
  def rslave: rslave = "rslave".asInstanceOf[rslave]
  
  @scala.inline
  def sctp: sctp = "sctp".asInstanceOf[sctp]
  
  @scala.inline
  def secret: secret = "secret".asInstanceOf[secret]
  
  @scala.inline
  def service: service = "service".asInstanceOf[service]
  
  @scala.inline
  def shared: shared = "shared".asInstanceOf[shared]
  
  @scala.inline
  def slave: slave = "slave".asInstanceOf[slave]
  
  @scala.inline
  def splunk: splunk = "splunk".asInstanceOf[splunk]
  
  @scala.inline
  def ssh: ssh = "ssh".asInstanceOf[ssh]
  
  @scala.inline
  def swarm: swarm = "swarm".asInstanceOf[swarm]
  
  @scala.inline
  def syslog: syslog = "syslog".asInstanceOf[syslog]
  
  @scala.inline
  def tcp: tcp = "tcp".asInstanceOf[tcp]
  
  @scala.inline
  def tmpfs: tmpfs = "tmpfs".asInstanceOf[tmpfs]
  
  @scala.inline
  def udp: udp = "udp".asInstanceOf[udp]
  
  @scala.inline
  def updating: updating = "updating".asInstanceOf[updating]
  
  @scala.inline
  def volume: volume = "volume".asInstanceOf[volume]
  
  @js.native
  sealed trait attachment extends js.Object
  
  @js.native
  sealed trait awslogs extends LoggingDriverType
  
  @js.native
  sealed trait bind extends MountType
  
  @js.native
  sealed trait cached extends MountConsistency
  
  @js.native
  sealed trait cfssl extends js.Object
  
  @js.native
  sealed trait completed extends UpdateState
  
  @js.native
  sealed trait config extends js.Object
  
  @js.native
  sealed trait consistent extends MountConsistency
  
  @js.native
  sealed trait container extends js.Object
  
  @js.native
  sealed trait daemon extends js.Object
  
  @js.native
  sealed trait default extends MountConsistency
  
  @js.native
  sealed trait delegated extends MountConsistency
  
  @js.native
  sealed trait etwlogs extends LoggingDriverType
  
  @js.native
  sealed trait fluentd extends LoggingDriverType
  
  @js.native
  sealed trait gelf extends LoggingDriverType
  
  @js.native
  sealed trait global extends js.Object
  
  @js.native
  sealed trait host extends js.Object
  
  @js.native
  sealed trait http extends js.Object
  
  @js.native
  sealed trait https extends js.Object
  
  @js.native
  sealed trait image extends js.Object
  
  @js.native
  sealed trait ingress extends js.Object
  
  @js.native
  sealed trait journald extends LoggingDriverType
  
  @js.native
  sealed trait `json-file` extends LoggingDriverType
  
  @js.native
  sealed trait local extends js.Object
  
  @js.native
  sealed trait network extends js.Object
  
  @js.native
  sealed trait `next-exit` extends js.Object
  
  @js.native
  sealed trait node extends js.Object
  
  @js.native
  sealed trait none extends LoggingDriverType
  
  @js.native
  sealed trait `not-running` extends js.Object
  
  @js.native
  sealed trait paused extends UpdateState
  
  @js.native
  sealed trait plugin extends js.Object
  
  @js.native
  sealed trait `private` extends MountPropagation
  
  @js.native
  sealed trait removed extends js.Object
  
  @js.native
  sealed trait replicated extends js.Object
  
  @js.native
  sealed trait rollback_completed extends UpdateState
  
  @js.native
  sealed trait rollback_paused extends UpdateState
  
  @js.native
  sealed trait rollback_started extends UpdateState
  
  @js.native
  sealed trait rprivate extends MountPropagation
  
  @js.native
  sealed trait rshared extends MountPropagation
  
  @js.native
  sealed trait rslave extends MountPropagation
  
  @js.native
  sealed trait sctp extends js.Object
  
  @js.native
  sealed trait secret extends js.Object
  
  @js.native
  sealed trait service extends js.Object
  
  @js.native
  sealed trait shared extends MountPropagation
  
  @js.native
  sealed trait slave extends MountPropagation
  
  @js.native
  sealed trait splunk extends LoggingDriverType
  
  @js.native
  sealed trait ssh extends js.Object
  
  @js.native
  sealed trait swarm extends js.Object
  
  @js.native
  sealed trait syslog extends LoggingDriverType
  
  @js.native
  sealed trait tcp extends js.Object
  
  @js.native
  sealed trait tmpfs extends MountType
  
  @js.native
  sealed trait udp extends js.Object
  
  @js.native
  sealed trait updating extends UpdateState
  
  @js.native
  sealed trait volume extends MountType
}
