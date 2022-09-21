organization := "org.scalablytyped"
name := "firebase__app-check-compat"
version := "0.2.12-10c7ae"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.7.33-70e6f2",
  "org.scalablytyped" %%% "firebase__app-check" % "0.5.12-de111c",
  "org.scalablytyped" %%% "firebase__app-check-types" % "0.4.0-46123f",
  "org.scalablytyped" %%% "firebase__app-compat" % "0.1.34-dc6500",
  "org.scalablytyped" %%% "firebase__app-types" % "0.7.0-fb8d43",
  "org.scalablytyped" %%% "firebase__component" % "0.5.17-c48592",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.3-442cc4",
  "org.scalablytyped" %%% "firebase__util" % "1.6.3-0d2002",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
